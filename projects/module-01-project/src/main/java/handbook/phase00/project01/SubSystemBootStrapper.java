package handbook.phase00.project01;


public class SubSystemBootStrapper {
    private final TaskRegistry registry;
    private final String environment;

    public SubSystemBootStrapper(TaskRegistry registry,String environment){
        if(environment == null || environment.trim().isEmpty()){
            throw new IllegalArgumentException("Environment boot parameter required");
        }
        this.registry = registry;
        this.environment = environment;
    }

    public void start(){
        System.out.println("Booting Task Registry Subsystem in [" + environment + "]...");
        System.out.println("Subsystem initial registry count : " + registry.getRegisteredTasks().size());
    }
}