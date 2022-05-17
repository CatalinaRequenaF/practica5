/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

/**
 *
 * @author catal
 */
public class Calculadora implements ICalculadora {
    public Calculadora() {}
    
    public float suma (float a, float b){
        return a + b;
    }
    
    public float division(float a, float b){
        return (a/b);
    }
    
    public float resta(float a, float b){
        return a - b;
    }

    public float multiplicacion(float a, float b){
        return a * b;
    }

}

