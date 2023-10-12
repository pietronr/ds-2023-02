package observer;

import classes.Célula;

public interface Observer {
    void update(Célula subject);
    
    void setHasBeenUpdated(Boolean foiAtualizado);
    Boolean getHasBeenUpdated();
}
