package Task;


import java.time.LocalDateTime;
import java.util.UUID;

public abstract class AbstractTask {
private String id;
private LocalDateTime createdAt;
private LocalDateTime executedAt;

    public AbstractTask() {
       this.createdAt=LocalDateTime.now();

        this.id=UUID.randomUUID().toString();    
    }


    public String getId() {
        return id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getExecutedAt() {
        return executedAt;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setExecutedAt(LocalDateTime executedAt) {
        this.executedAt = executedAt;
    }
    
    public void setExecutedAt() {
        this.executedAt = LocalDateTime.now();
    }

@Override
public String toString() {
return "\n"+getClass().getName()+"\nId : "+id+"\nCreated at:"+createdAt+"\nExecuted at:"+executedAt;}

}
