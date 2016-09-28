/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jaime
 */
public class Helper {

    public static void mensaje(Component ventana, String mensaje, int tipo) {
        switch (tipo) {
            case 1:
                JOptionPane.showMessageDialog(ventana, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(ventana, mensaje, "Advertencia", JOptionPane.WARNING_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(ventana, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
                break;

        }
    }

    public static void limpiadoTabla(JTable tabla1) {
        int nf = tabla1.getRowCount();
        int nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                tabla1.setValueAt("", i, j);
            }

        }
    }

    public static void porDefectoTabla(JTable tabla1) {
        DefaultTableModel tm;
        tm = (DefaultTableModel) tabla1.getModel();
        tm.setRowCount(0);
        tm.setColumnCount(0);
    }

    public static void habilitarBotones(JButton[] botonesH) {

        for (int i = 0; i < botonesH.length; i++) {
            botonesH[i].setEnabled(true);
        }
    }

    public static void deshabilitarBotones(JButton[] botonesD) {

        for (int i = 0; i < botonesD.length; i++) {
            botonesD[i].setEnabled(false);
        }
    }

    public static int cantidadPares(JTable tabla1) {
        int aux, cont = 0;
        int nf = tabla1.getRowCount();
        int nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);

                if (aux % 2 == 0) {
                    cont++;
                }
            }
        }
        return cont;
    }

    public static void pares(JTable tabla1) {
        int aux;
        int nf = tabla1.getRowCount();
        int nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);

                if (aux % 2 == 0) {
                    tabla1.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void diagonalSecundaria(JTable tabla1, JTable tabla2) {
        int aux;
        int nf = tabla1.getRowCount();
        int nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);

                if (nf - 1 - i == j) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void triangularSuperior(JTable tabla1, JTable tabla2) {
        int aux;
        int nf = tabla1.getRowCount();
        int nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);

                if (i == j || j >= i) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void triangularInferior(JTable tabla1, JTable tabla2) {
        int aux;
        int nf = tabla1.getRowCount();
        int nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);

                if (i == j || j <= i) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void matrizTraspuesta(JTable tabla1, JTable tabla2) {
        int aux;
        int nf = tabla1.getRowCount();
        int nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                tabla2.setValueAt(aux, j, i);
            }
        }
    }

    public static void letraA(JTable tabla1, JTable tabla2) {
        int aux;
        int nf = tabla1.getRowCount();
        int nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);

                if (j == 0 || i == 0 || i == (nf - 1) / 2 || j == (nc - 1)) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void letraZ(JTable tabla1, JTable tabla2) {
        int aux;
        int nf = tabla1.getRowCount();
        int nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);

                if (i == 0 || nf - 1 - i == j || i == (nf - 1)) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void letraT(JTable tabla1, JTable tabla2) {
        int aux;
        int nf = tabla1.getRowCount();
        int nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);

                if (i == 0 || j == (nc / 2)) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void letraV(JTable tabla1, JTable tabla2) {
        int aux;
        int nf = tabla1.getRowCount();
        int nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);

                if (j == i / 2 || j == nf - 1 - i / 2) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void letraE(JTable tabla1, JTable tabla2) {
        int aux;
        int nf = tabla1.getRowCount();
        int nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);

                if (i == 0 || j == 0 || i == nf - 1 || i == nf / 2) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void letraF(JTable tabla1, JTable tabla2) {
        int aux;
        int nf = tabla1.getRowCount();
        int nc = tabla1.getColumnCount();
        
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);

                if (j == 0 || i == 0 || i == nf / 2) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void letraP(JTable tabla1, JTable tabla2) {
        int aux;
        int nf = tabla1.getRowCount();
        int nc = tabla1.getColumnCount();
               
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                
                if ((j == 0 || i == 0 || i == nf / 2) || (j == nc - 1 && j / i >= 2)) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void letraI(JTable tabla1, JTable tabla2) {
        int  aux;
        int nf = tabla1.getRowCount();
        int nc = tabla1.getColumnCount();
        
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                
                if (i == 0 || j == (nc / 2) || i == (nf - 1)) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

       public static void letraN(JTable tabla1, JTable tabla2) {
        int aux;
        int nf = tabla1.getRowCount();
        int nc = tabla1.getColumnCount();
        
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
        
                if (j == 0 || i == j || j == nc - 1) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void letraY(JTable tabla1, JTable tabla2) {
        int aux;
        int nf = tabla1.getRowCount();
        int nc = tabla1.getColumnCount();
        
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                
                if (j == nc / 2 && j <= i || (i + j == nf - 1 && i <= j) || (i == j && i + j <= nf)) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void letraX(JTable tabla1, JTable tabla2) {
        int aux;
        int nf = tabla1.getRowCount();
        int nc = tabla1.getColumnCount();
        
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                
                if (j == i || nf - 1 - i == j) {
                    tabla2.setValueAt(aux, i, j);
                }
            }

        }
    }
}
