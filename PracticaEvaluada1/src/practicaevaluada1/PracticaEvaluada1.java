/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaevaluada1;

import javax.swing.JOptionPane;

/**
 *
 * @author moisescascante Una empresa necesita determinar el monto total que
 * debe pagar a la Caja Costarricense del Seguro Social (CCSS). Para esto, se
 * requiere un programa que calcule dicho monto basado en el salario para un
 * empleado especifico. El programa debe solicitar el salario individual y
 * calcular el monto total a pagar aplicando los siguientes rubros: - Seguro de
 * Enfermedad y Maternidad (SEM) al 9.25% del salario. - Invalidez, Vejez y
 * Muerte (IVM) al 5.08% del salario. Por ejemplo, si el salario de un empleado
 * es de ₡300,000: ₡300,000 x 0.0925 = ₡27,750 (Monto de SEM) ₡300,000 x 0.0508
 * = ₡15,240 (Monto de IVM) Además del monto con deducciones se le debe de
 * calcular 2.5% para la asociación. Cree una variable llamada variableMuestra y
 * sume los tres montos ahí En consecuencia, la empresa deberá pagar a la CCSS
 * un total de ₡42,990. Resultado esperado para el programa: - La empresa deberá
 * abonar a la CCSS el monto de #####.## por concepto de SEM y IVM. - Para la
 * asociación de la empresa se le asigna un valor 6425,25
 */
public class PracticaEvaluada1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int salario = 300000; //Establezco monto del salario como variable
        //JOptionPane.showInputDialog(null, "Digite su Salario:");
        //int salario = 300000;
        double salarioSem = salario * 0.0925; // Calculo salario SEM
        double salarioIVM = salario * 0.0508; // Calculo deduccion IVM
        double salarioAso = (salario - salarioSem - salarioIVM) * 0.025; // Calculo aporte asociacion solidarista     
        //double variableMuestra = (salarioSem + salarioIVM + salarioAso);

        JOptionPane.showMessageDialog(null, "El monto de la deduccion por salarioSEM es:" + salarioSem);
        JOptionPane.showMessageDialog(null, "El monto de la deduccion por salarioIVM es:" + salarioIVM);
        JOptionPane.showMessageDialog(null, "El monto de la deduccion por salarioAso es:" + salarioAso);

    }

}
