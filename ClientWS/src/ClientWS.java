import proxy.BanqueService;
import proxy.BanqueWs;
import proxy.Compte;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService stubWS = new BanqueWs().getBanqueServicePort();

        System.out.println(stubWS.convertionEuroToDh(50));

        Compte cp = stubWS.getCompte(2L);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());
        List<Compte> cptes = stubWS.listComptes();
        cptes.forEach(c -> {
            System.out.println("----------------------");
            System.out.println(c.getCode());
            System.out.println(c.getSolde());
        });
    }
}
