package top.woaibocai.ioc01;

public class DefaultServiceLocator {

  private static ClientServiceImpl clientService= new ClientServiceImpl();

  public ClientServiceImpl createClientServiceInstance() {
    return clientService;
  }
}