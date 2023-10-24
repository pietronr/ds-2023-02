import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VerificarClasseNoDiretorio {

    public static Boolean verificar(String[] args) {
        String dirPath = null;
        String className = null;
        boolean useParallelStream = false;

        if (args != null && args.length >= 2) {
            dirPath = args[0];
            className = args[1];
            useParallelStream = args.length > 2 && (args[2].equals("-parallel") || args[2].equals("-p"));
        } else {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o caminho do diretório: ");
            dirPath = scanner.nextLine();

            System.out.println("Digite o nome da classe: ");
            className = scanner.nextLine();

            System.out.println("Use a opção -parallel (sim/não)? ");
            String parallelOption = scanner.nextLine().toLowerCase();
            useParallelStream = parallelOption.equals("sim") || parallelOption.equals("s")
                    || parallelOption.equals("yes");

            scanner.close();
        }

        long startTime = System.nanoTime();

        try {
            List<String> classFiles = searchForClassFiles(dirPath, className, useParallelStream);

            long endTime = System.nanoTime();
            long elapsedTime = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);

            if (classFiles.isEmpty()) {
                System.out.println("Classe não encontrada.");
                return false;
            } else {
                System.out.println("Classe encontrada em:");
                for (String classFile : classFiles) {
                    System.out.println(classFile);
                }
            }
            System.out.println("Tempo gasto: " + elapsedTime + " milissegundos");
            System.out.println("Total de arquivos .java consultados: " + classFiles.size());
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public static List<String> searchForClassFiles(String dirPath, String className, boolean useParallelStream)
            throws IOException {
        String path = "D:/Faculdade/Design de Software/ds-2023-02/classe/" + dirPath;

        Path dir = Path.of(path);
        Stream<Path> filesStream = Files.walk(dir);

        if (useParallelStream) {
            filesStream = filesStream.parallel();
        }

        List<String> result = filesStream
                .filter(file -> file.toString().endsWith(".java") || file.toString().endsWith(".jar")
                        || file.toString().endsWith(".war"))
                .filter(file -> {
                    if (file.toString().endsWith(".java")) {
                        String fileName = file.getFileName().toString();
                        return fileName.equals(className + ".java");
                    } else {
                        try {
                            return Files.newInputStream(file).readAllBytes()
                                    .toString().contains(className);
                        } catch (IOException e) {
                            return false;
                        }
                    }
                })
                .map(Path::toString)
                .collect(Collectors.toList());

        filesStream.close();

        return result;
    }
}
