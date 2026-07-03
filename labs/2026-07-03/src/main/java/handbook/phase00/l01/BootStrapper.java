package handbook.phase00.l01;

public class BootStrapper {
    private final ConfigLoader loader;

    public BootStrapper(ConfigLoader loader){
        this.loader = loader;
    }

    private boolean isClassAvailable(String className){
        try {
            Class.forName(className);
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    public void boot(){
       String env = loader.getConfig("environment");
        
       System.out.println("System starting in " + env + " environment...");
    
       boolean hasOptionalDriver = isClassAvailable("handbook.phase00.l01.ConfigLoader");
       System.out.println("Optional MySQL Driver loadable: " + hasOptionalDriver);
    }


}
