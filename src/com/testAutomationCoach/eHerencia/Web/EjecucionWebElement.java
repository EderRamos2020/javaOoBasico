package com.testAutomationCoach.eHerencia.Web;
import com.testAutomationCoach.eHerencia.animals.Animal;
import com.testAutomationCoach.libs.Input;

public class EjecucionWebElement {

            public static void main(String[] args) {
            //se crea dos arrays de clase String de 3 indices o posiciones
            String[] eleWeb={"entrar","condiciones","faisan"};
            String[] tipoele={"button","link","image"};

            //crea un objeto de clase WebElement e invoca dos metodos de esa clase WebElement
            WebElement figura = new WebElement();
            figura.clic();
            figura.clicDerecho();

            //crea un objeto(enter) de clase Button, invoca dos metodos de la clase hija Button, invoca tres metodos de la clase
            // padre Container e invoca un metodo de la clase abuelo WebElement
            Button enter = new Button();
            enter.setText("entrar");
            enter.setColor("purpure");
            enter.setElements(eleWeb.length,tipoele,eleWeb);
            enter.getElements();
            enter.clic();
            enter.clicDerecho();

            //crea un objeto(faisan) de clase Image en el cual se le envian parametros al constructor
            //invoca tres metodos de la clase hija Image, invoca dos metodos y una funcion que retorna un array de la clase padre Container
            // e invoca un metodo de la clase abuelo WebElement
            Image faisan = new Image("faisan", "superior derecha");
            faisan.secuencia();
            faisan.agregarRepositorio("naturaleza");
            faisan.getUbicacionImagen("arboles");
            faisan.setElements(3, tipoele, eleWeb);
            String[] elem =faisan.getElements();
            faisan.clic();
            faisan.clicDerecho();

            //crea un objeto(cua) de clase Container e invoca dos metodos pero ejecuta uno de la clase hija(Container)
            //y el otro de la clase padre(Webelement) ya que la clase hija(Container) no tiene ese metodo.
            Container cua = new Container();
            cua.clicDerecho();
            cua.clic();

            // declara un objeto(ele) de clase WebElement pero lo instancia o inicializa de la clase hija Image,
            // le envia parametros al constructor de la clase Image. Invoca tres metodos:
            // el metodo ele.scroll lo ejecuta de la clase hija (Image) y tambien esta definido en la clase abuelo (WebElement)
            // el metodo ele.clic lo ejecuta de la clase padre (Container) y tambien esta definido en la clase abuelo (WebElement)
            // el metodo ele.clicDerecho lo ejecuta de la clase abuelo (WebElement) ya que en la clase hija(Image) y
            // en la clase padre(Container) no existen esos metodos
            WebElement ele = new Image("montaña","superior-izquierda");
            ele.scroll();
            ele.clic();
            ele.clicDerecho();
            ele.pixelesX = 3.7;
            ele.pixelesY = 5.2;

            //el anterior objeto "ele" de clase WebElement e instanciado a clase Image, luego se instancia nuevamente a la clase Button
            // es decir el objeto es de clase WebElement y es igual y/o separa un espacio de memoria y/o va almacenar un objeto de
            // tipo Button ya que es clase hija de WebElement. "vocal letra=a" ó "vocal letra = e, etc".
            // el objeto ele es instanciado como un nuevo Button
            // del objeto ele se invoca el metodo clic() que no esta definido en la clase Button pero si esta definido en
            // la clase padre Container, tambien este metodo esta definido en la clase abuelo WebElement pero como esta primero
            // definido en la clase padre Container ejecuta el proceso que esta en este metodo definido en la clase Container.
            // de clase WebElement el objeto ele es igual, alamacena o se instancia como Button y se invoca el metodo clicDerecho(),
            // pero el metodo no esta definido en la clase Button ni tampoco en la clase padre Container pero si esta definido
            // en la clase abuelo WebElement lo que ejecuta el proceso del metodo clicDerecho() de la clase abuelo WebElement.
            ele = new Button();
            ele.clic();
            ele.clicDerecho();

            //crea el objeto lal de clase WebElement y se instancia de la misma clase WebElement
            //del objeto lal se invoca el metodo clicDerecho() el cual ejecuta el definido en la clase WebElement
            //tambien invoca el metodo clic() de la clase WebElement.
            WebElement lal = new WebElement();
            lal.clicDerecho();
            lal.clic();

            //crea un objeto de clase WebElement y lo inicializa o lo instancia de clase Container
            WebElement la = new Container();
            // anteriormente el objeto lal era de clase WebElement, ahora al objeto lal se le separa un nuevo objeto de memoria
            // de tipo Container o se inicializa o se instancia como un nuevo objeto de clase Container y se borra el
            // anterior objeto de memoria (WebElement)
            lal = new Container();
            // el objeto de clase WebElement se instancia o se inicializa nuevamente como un objeto
            // en memoria de clase Image, se le envia parametros al metodo constructor para inicializar algunos atributos.
            // se borra de memoria el objeto de clase Container.
            lal =  new Image("mar","inferior");
            //** el objeto de memoria lal se instancia o se inicializa nuevamente como un objeto en memoria de clase Button,
            //** es decir este objeto en memoria lal almacena una instancia de clase Button
            //** este objeto de clase Button tiene un metodo constructor que no requiere enviarle parametros
            //** el anterior objeto lal de tipo/clase Image se borra de memoria
            lal = new Button();

            WebElement[] compo = {new Button(), new Image("sol", "derecha"), new Container()};
            WebElement[] nente = new WebElement[]{new Image("playa","izquierda"), new Button(), new Container()};
            WebElement[] ment = new WebElement[5];
            Button salt = new Button();
            ment[0] = salt;
            ment[1] = new Button();
            ment[2] = new Image("nubes","superior-izquierda");
            ment[3] = new Container();
            ment[4] = new WebElement();

            Persona joven = new Persona("nano", 18, "321");
            int cont=Persona.contadorObjetos;
            System.out.println(joven);
            Persona militar = new Persona();
            int cont1=Persona.contadorObjetos;
            System.out.println(militar);


            System.out.println(joven.getObjetos("por objeto, invoco el metodo, le envio este parametro y me retorna un atributo de clase "));
            militar.setAge(cont1);
            System.out.println(Persona.getIncrementoAge());

            Cuenta amiga = new Cuenta(joven, "ahorros");



















    }


}
