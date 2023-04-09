package annotations;

@Service(name = "TestService")
public class InitService {
    public void initService() {
        System.out.println("Do smth");
    }
}
