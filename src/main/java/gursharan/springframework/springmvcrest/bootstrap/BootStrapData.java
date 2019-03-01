package gursharan.springframework.springmvcrest.bootstrap;
import gursharan.springframework.springmvcrest.domain.Customer;
import gursharan.springframework.springmvcrest.repositories.CustomRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final CustomRepository customRepository;

    public BootStrapData(CustomRepository customRepository){
        this.customRepository=customRepository;
    }

    public void run(String... args) throws Exception
    {
        System.out.println("Loading the customer Data ");

        Customer c1=new Customer();
        c1.firstName="Gursharan Sandhu";
        c1.lastName="Sandhu";
        customRepository.save(c1);

        Customer c2= new Customer();
        c2.firstName="Karan";
        c2.lastName="Sandhu";
        customRepository.save(c2);

        Customer c3=new Customer();
        c3.lastName="Sandhu";
        c3.firstName="Guru";
        customRepository.save(c3 );
        System.out.println("Customer saved :" +customRepository.count());
        }

}
