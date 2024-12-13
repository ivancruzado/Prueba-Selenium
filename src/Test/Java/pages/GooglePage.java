package pages;

public class GooglePage extends BasePage{

    public GooglePage(){
        super(driver);

    }

    public void navegarGoogle(){
        navigateTo("https://www.google.com");
    }

    public void busco(){
        //navigateTo("https://www.google.com");
        System.out.println("hola");
    }
    public void encuentro(){
        //navigateTo("https://www.google.com");
        System.out.println("pato");
    }

}
