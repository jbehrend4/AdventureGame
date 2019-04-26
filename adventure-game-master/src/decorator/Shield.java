
package decorator;

public class Shield extends CharacterDecorator {
    
    public Shield (Character character) {
        super(character);
    }

    @Override
    public String getName() {
        return character.getName() + ", Shield-Bearer";
    }

    @Override
    public double getMight() {
        return character.getMight() + 5;
    }
    
}
