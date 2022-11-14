/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon.reto5;

/**
 *
 * @author santi
 */
public class Blastoise extends Pokemon {

    public Blastoise(String nombre, byte nivel, int salud) {
        super(nombre, nivel, salud);
    }
    

    @Override
    public Pokemon evolucionar() throws NoEvolutionException {
       throw new NoEvolutionException();
       
    }

    @Override
    public void gritar() {
        System.out.println("Bla blastoise!");
    }
    
}