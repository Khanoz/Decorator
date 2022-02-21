public class PersonaDecorator extends Persona{
    public Persona decoratedPersona;
    
    public PersonaDecorator(Persona p){
        super();
        this.decoratedPersona = p;
    }
}
