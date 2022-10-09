
package Vistas;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class frmFiguras extends javax.swing.JFrame {
    javax.swing.ImageIcon iconoTilde = 
            new javax.swing.ImageIcon(getClass().getResource("/Iconos/tilde.gif"));
    
    DefaultTableModel dtm = new DefaultTableModel();
    
    public frmFiguras() {
        initComponents();
        String base;
        String[] titulos = new String[] {"Ancho", "Alto", "Area", "Perímetro"};        
        dtm.setColumnIdentifiers(titulos);
        tblRectangulos.setModel(dtm);
        //btnCalcular.setEnabled(false);
        //chkEquilatero.setEnabled(true);
        //chkEscaleno.setSelected(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gradTriangulos = new javax.swing.ButtonGroup();
        jLabel8 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtAncho = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAlto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblPerimetro = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        lblTildeAncho = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRectangulos = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        btnInsertarRectangulo = new javax.swing.JButton();
        btnActualizarRectangulo = new javax.swing.JButton();
        btnEliminarCuadrado = new javax.swing.JButton();
        btnEliminarTodosRetangulos = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblTildeAlto = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        radEquilatero = new javax.swing.JRadioButton();
        radEscaleno = new javax.swing.JRadioButton();
        radIsosceles = new javax.swing.JRadioButton();
        cmdRadios = new javax.swing.JButton();
        chkEquilatero = new javax.swing.JCheckBox();
        chkEscaleno = new javax.swing.JCheckBox();
        chkIsosceles = new javax.swing.JCheckBox();
        cmdCheckBox = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cboTriangulos = new javax.swing.JComboBox<>();
        cmdCombos = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        chkEquilateros = new javax.swing.JCheckBox();
        chkEscalenos = new javax.swing.JCheckBox();
        chkIsosceless = new javax.swing.JCheckBox();
        chkConos = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        cmdCheckBoxs = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        radEquilateross = new javax.swing.JRadioButton();
        radEscalenos = new javax.swing.JRadioButton();
        radIsosceless = new javax.swing.JRadioButton();
        radCono = new javax.swing.JRadioButton();
        cmdRadioss = new javax.swing.JButton();
        cboTrianguloss = new javax.swing.JComboBox<>();
        cmdComboBoxs = new javax.swing.JButton();
        cmdGuardar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtBase = new javax.swing.JTextField();
        txtLado1 = new javax.swing.JTextField();
        txtLado2 = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnCalcularTriangulo = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        lblArea = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        jLabel8.setText("RADIO BUTTON - OPCIONES SELECCIÓN ÚNICA");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PROGRAMA FIGURAS PLANAS");

        txtAncho.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAnchoFocusLost(evt);
            }
        });
        txtAncho.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAnchoKeyTyped(evt);
            }
        });

        jLabel1.setText("ANCHO: (*)");

        jLabel2.setText("ALTO:(*)");

        txtAlto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAltoFocusLost(evt);
            }
        });

        jLabel3.setText("PERIMETRO:");

        jLabel4.setText("AREA:");

        jLabel5.setText("TIPO:");

        lblPerimetro.setText("00");

        txtArea.setEditable(false);
        txtArea.setText("00");

        lblTipo.setText("?????");

        btnCalcular.setText("Calcular");
        btnCalcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCalcularMouseClicked(evt);
            }
        });
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdLimpiarMouseClicked(evt);
            }
        });
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });

        jLabel10.setText("Los campos marcados con (*) son obligados");

        tblRectangulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblRectangulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRectangulosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRectangulos);

        jLabel13.setText("CRUD");

        btnInsertarRectangulo.setText("Insertar");
        btnInsertarRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarRectanguloAccion(evt);
            }
        });

        btnActualizarRectangulo.setText("Actualizar");
        btnActualizarRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarRectanguloActionPerformed(evt);
            }
        });

        btnEliminarCuadrado.setText("Eliminar");
        btnEliminarCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarRectanguloAccion(evt);
            }
        });

        btnEliminarTodosRetangulos.setText("Eliminar Todos");
        btnEliminarTodosRetangulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTodosRetangulosActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");

        lblTildeAlto.setText("  ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                        .addGap(27, 27, 27)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtAncho, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                                            .addComponent(txtAlto))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblTildeAlto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblTildeAncho))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnCalcular)
                                        .addGap(32, 32, 32)
                                        .addComponent(cmdLimpiar)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)))
                                    .addComponent(jLabel3))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTipo)
                                    .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel10)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnInsertarRectangulo)
                                .addGap(18, 18, 18)
                                .addComponent(btnActualizarRectangulo)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminarCuadrado)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminarTodosRetangulos)
                                .addGap(69, 69, 69)
                                .addComponent(btnSalir))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLabel13)))
                .addContainerGap(211, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAncho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(lblPerimetro)
                    .addComponent(lblTildeAncho))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAlto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTildeAlto)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(lblTipo)
                    .addComponent(btnCalcular)
                    .addComponent(cmdLimpiar))
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertarRectangulo)
                    .addComponent(btnActualizarRectangulo)
                    .addComponent(btnEliminarCuadrado)
                    .addComponent(btnEliminarTodosRetangulos)
                    .addComponent(btnSalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(254, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cuadrados", jPanel1);

        gradTriangulos.add(radEquilatero);
        radEquilatero.setText("Con Borde");

        gradTriangulos.add(radEscaleno);
        radEscaleno.setText("Sin Borde");

        gradTriangulos.add(radIsosceles);
        radIsosceles.setText("Borde Punteado");

        cmdRadios.setText("Qué Opción de Radios??");
        cmdRadios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRadiosAccion(evt);
            }
        });

        chkEquilatero.setText("Equilatero");

        chkEscaleno.setText("Escaleno");

        chkIsosceles.setText("Isosceles");

        cmdCheckBox.setText("Qué Opciones de Checks?");
        cmdCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCheckBoxAccion(evt);
            }
        });

        jLabel6.setText("CHECK BOX - CASILLAS DE VERIFICACIÓN - MULTIPLES OPCIONES");

        jLabel7.setText("RADIO BUTTON - OPCIONES SELECCIÓN ÚNICA");

        cboTriangulos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar Relleno--", "Amarillo", "Azul", "Rojo" }));

        cmdCombos.setText("Qué Opción del Combo??");
        cmdCombos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCombosAccion(evt);
            }
        });

        jLabel9.setText("COMBOSBOX - CUADROS COMBINADOS - OPCIONES SELECCIÓN ÚNICA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(cboTriangulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmdCombos))
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(radEscaleno))
                        .addContainerGap(392, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmdRadios)
                            .addComponent(chkIsosceles)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(chkEscaleno)
                                .addGap(32, 32, 32)
                                .addComponent(cmdCheckBox))
                            .addComponent(chkEquilatero)
                            .addComponent(radIsosceles)
                            .addComponent(radEquilatero))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radEquilatero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radEscaleno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radIsosceles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmdRadios)
                .addGap(26, 26, 26)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkEquilatero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkEscaleno)
                    .addComponent(cmdCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkIsosceles)
                .addGap(46, 46, 46)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTriangulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdCombos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Componentes", jPanel3);

        chkEquilateros.setText("Equilatero");

        chkEscalenos.setText("Escaleno");

        chkIsosceless.setText("Isosceles");
        chkIsosceless.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkIsoscelessActionPerformed(evt);
            }
        });

        chkConos.setText("Cono");

        jLabel11.setText("Cuales son Figuras Planas?");

        cmdCheckBoxs.setText("Cuales Tildo??");
        cmdCheckBoxs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdCheckBoxsMouseClicked(evt);
            }
        });

        jLabel12.setText("Cual Triangulo tiene los tres lados iguales");

        gradTriangulos.add(radEquilateross);
        radEquilateross.setText("Equilatero");
        radEquilateross.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radEquilaterossMouseClicked(evt);
            }
        });

        gradTriangulos.add(radEscalenos);
        radEscalenos.setText("Escaleno");

        gradTriangulos.add(radIsosceless);
        radIsosceless.setText("Isosceles");

        gradTriangulos.add(radCono);
        radCono.setText("Cono");

        cmdRadioss.setText("Cuál selecciono?");
        cmdRadioss.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdRadiossMouseClicked(evt);
            }
        });

        cboTrianguloss.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar Triangulo--", "Equilatero", "Escaleno", "Isosceles" }));
        cboTrianguloss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTriangulossActionPerformed(evt);
            }
        });

        cmdComboBoxs.setText("Indice e Item Seleccionado");
        cmdComboBoxs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdComboBoxsMouseClicked(evt);
            }
        });
        cmdComboBoxs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdComboBoxsActionPerformed(evt);
            }
        });

        cmdGuardar.setText("GUARDAR");
        cmdGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdGuardarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(27, 27, 27))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkEquilateros)
                                    .addComponent(chkIsosceless)
                                    .addComponent(chkEscalenos)
                                    .addComponent(chkConos)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(cmdCheckBoxs))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(cboTrianguloss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmdComboBoxs)
                            .addComponent(radEscalenos)
                            .addComponent(radEquilateross)
                            .addComponent(radIsosceless)
                            .addComponent(radCono)
                            .addComponent(cmdRadioss)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(cmdGuardar)))
                .addContainerGap(370, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkEquilateros)
                    .addComponent(radEquilateross))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkEscalenos)
                            .addComponent(radEscalenos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkIsosceless)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkConos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdCheckBoxs))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(radIsosceless)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radCono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdRadioss)))
                .addGap(38, 38, 38)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTrianguloss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdComboBoxs))
                .addGap(27, 27, 27)
                .addComponent(cmdGuardar)
                .addContainerGap(270, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CheckBox", jPanel4);

        jLabel14.setText("BASE:");

        jLabel15.setText("LADO1");

        jLabel16.setText("LADO2");

        jLabel17.setText("ALTURA");

        btnCalcularTriangulo.setText("Calcular");
        btnCalcularTriangulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCalcularTrianguloMouseClicked(evt);
            }
        });
        btnCalcularTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularTrianguloActionPerformed(evt);
            }
        });

        jLabel18.setText("PROGRAMA DEL TRIANGULO");

        lblArea.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblArea.setForeground(new java.awt.Color(51, 51, 255));
        lblArea.setText("0");

        jLabel20.setText("AREA:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCalcularTriangulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAltura)
                            .addComponent(txtLado2)
                            .addComponent(txtBase)
                            .addComponent(txtLado1))
                        .addGap(107, 107, 107)
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(lblArea, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel18)))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel18)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(lblArea)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(txtLado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel17))
                .addGap(29, 29, 29)
                .addComponent(btnCalcularTriangulo)
                .addContainerGap(289, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Triangulos", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnCalcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcularMouseClicked
        // TODO add your handling code here:
        //PROBLEMA TODA LA INFORMACIÓN INGRESADA Y MOSTRADA EN LOS OBJETOS
        //CREADOS SON DE TIPO CADENA STRING 
        //Integer.parseInt(cadena) Float.parseFloat(cadena)
        if (txtAncho.getText().equals("") ||
            txtAlto.getText().equals("")){
          JOptionPane.showMessageDialog(null, "FAVOR COMPLETAR LOS CAMPOS OBLIGADOS (*)");
        }
        else{
            double ancho = Double.parseDouble(txtAncho.getText());
            double alto  = Double.parseDouble(txtAlto.getText());
            double perimetro  = ancho*2 + alto*2;
            double area  = ancho * alto;

            txtArea.setText(String.valueOf(area));
            lblPerimetro.setText(String.valueOf(perimetro));
        }
    }//GEN-LAST:event_btnCalcularMouseClicked

    public void recalcularRectangulos () {
      if (txtAncho.getText().equals("") ||
            txtAlto.getText().equals("")){
          JOptionPane.showMessageDialog(null, "FAVOR COMPLETAR LOS CAMPOS OBLIGADOS (*)");
        }
        else{
            double ancho = Double.parseDouble(txtAncho.getText());
            double alto  = Double.parseDouble(txtAlto.getText());
            double perimetro  = ancho*2 + alto*2;
            double area  = ancho * alto;

            txtArea.setText(String.valueOf(area));
            lblPerimetro.setText(String.valueOf(perimetro));
        }
    }
    
    private void cmdRadiosAccion(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRadiosAccion
        // TODO add your handling code here:
        if (radEquilatero.isSelected())
                JOptionPane.showMessageDialog(null, "Seleccionó: " + radEquilatero.getText());
        else if (radEscaleno.isSelected())
            JOptionPane.showMessageDialog(null, "Seleccionó: " + radEscaleno.getText());
        else if (radIsosceles.isSelected())
            JOptionPane.showMessageDialog(null, "Seleccionó: " + radIsosceles.getText());
        else
            JOptionPane.showMessageDialog(null, "SIN Seleccion");
    }//GEN-LAST:event_cmdRadiosAccion

    private void cmdCheckBoxAccion(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCheckBoxAccion
        // TODO add your handling code here:
        String cadena = "";
        if (chkEquilatero.isSelected())
            cadena = chkEquilatero.getText() + " ";
        if (chkEscaleno.isSelected())
            cadena = chkEscaleno.getText() + " ";
        if (chkIsosceles.isSelected())
            cadena = chkIsosceles.getText() + " ";
        if (cadena == "")
            cadena = "SIN TILDAR OPCIONES DE LAS CASILLAS";
        
        JOptionPane.showMessageDialog(null, cadena);
    }//GEN-LAST:event_cmdCheckBoxAccion

    private void cmdCombosAccion(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCombosAccion
        // TODO add your handling code here:
        int    indice = (int)   cboTriangulos.getSelectedIndex();
        String cadena = (String)cboTriangulos.getSelectedItem();
        indice = (int)   cboTriangulos.getSelectedIndex();
        cadena = (String)cboTriangulos.getSelectedItem();
        JOptionPane.showMessageDialog(null, "INDICE[" + indice + "] \nCADENA:"+cadena);
    }//GEN-LAST:event_cmdCombosAccion

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtAnchoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnchoKeyTyped
        // TODO add your handling code here:
        char tipoTecla = evt.getKeyChar();
        if (! Character.isDigit(tipoTecla))
            evt.consume();

        int maximo = 3;
        if (txtAncho.getText().length() > maximo-1)
            evt.consume();
    }//GEN-LAST:event_txtAnchoKeyTyped

    private void cmdLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdLimpiarMouseClicked
        // TODO add your handling code here:
        limpiarCajas();
    }//GEN-LAST:event_cmdLimpiarMouseClicked

    private void txtAnchoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAnchoFocusLost
        // TODO add your handling code here:
        if (! txtAncho.getText().equals("")){
            lblTildeAncho.setIcon(iconoTilde);
            recalcularRectangulos();
        }
        else        
            lblTildeAncho.setIcon(null);      
        activarBotones();
    }//GEN-LAST:event_txtAnchoFocusLost

    private void txtAltoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAltoFocusLost
        // TODO add your handling code here:        
        if (! txtAlto.getText().equals("")){
            lblTildeAlto.setIcon(iconoTilde);
            recalcularRectangulos();
        }
        else        
            lblTildeAncho.setIcon(null);         
        //activarBotones();
    }//GEN-LAST:event_txtAltoFocusLost

    private void chkIsoscelessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkIsoscelessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkIsoscelessActionPerformed

    private void cmdCheckBoxsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdCheckBoxsMouseClicked
        // TODO add your handling code here:
        String cadena = "";
        if (chkEquilateros.isSelected())
            cadena = cadena + chkEquilateros.getText() + " ";
        if (chkEscalenos.isSelected())
            cadena = cadena + chkEscalenos.getText() + " ";
        if (chkIsosceless.isSelected())
           cadena = cadena + chkIsosceless.getText() + " ";
        if (chkConos.isSelected())
           cadena = cadena + chkConos.getText() + " ";
        if (cadena == "")
            cadena = "SIN TILDAR OPCIONES DE LAS CASILLAS";
        JOptionPane.showMessageDialog(null, cadena);
    }//GEN-LAST:event_cmdCheckBoxsMouseClicked

    private void cmdRadiossMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdRadiossMouseClicked
        // TODO add your handling code here:
        if (radEquilateross.isSelected())
            JOptionPane.showMessageDialog(null, "Seleccionó: " + radEquilateross.getText());
        else if (radEscalenos.isSelected())
            JOptionPane.showMessageDialog(null, "Seleccionó: " + radEscalenos.getText());
        else if (radIsosceless.isSelected())
            JOptionPane.showMessageDialog(null, "Seleccionó: " + radIsosceless.getText());
        else if (radCono.isSelected())
            JOptionPane.showMessageDialog(null, "Seleccionó: " + radCono.getText());
        else
            JOptionPane.showMessageDialog(null, "SIN Seleccion");
    }//GEN-LAST:event_cmdRadiossMouseClicked

    private void cmdComboBoxsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdComboBoxsMouseClicked
        // TODO add your handling code here:
        int indice    = (int) cboTrianguloss.getSelectedIndex();
        String cadena = (String)cboTrianguloss.getSelectedItem();
        JOptionPane.showMessageDialog(null, "INDICE[" + indice + "] \nCADENA:"+cadena);
    }//GEN-LAST:event_cmdComboBoxsMouseClicked

    private void cmdGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdGuardarMouseClicked
        // TODO add your handling code here:
        double ancho = Double.parseDouble(txtAncho.getText());
        //Cuadrado myCuadrado = new Cuadrado(ancho........);
        //controlador
    }//GEN-LAST:event_cmdGuardarMouseClicked

    private void cboTriangulossActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTriangulossActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboTriangulossActionPerformed

    private void cmdComboBoxsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdComboBoxsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdComboBoxsActionPerformed

    private void radEquilaterossMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radEquilaterossMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_radEquilaterossMouseClicked

    private void btnInsertarRectanguloAccion(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarRectanguloAccion
        // TODO add your handling code here:
        insertarRectangulo();
    }//GEN-LAST:event_btnInsertarRectanguloAccion

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void btnEliminarRectanguloAccion(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarRectanguloAccion
        // TODO add your handling code here:
        eliminarRectangulo();
    }//GEN-LAST:event_btnEliminarRectanguloAccion

    private void btnActualizarRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarRectanguloActionPerformed
        // TODO add your handling code here:
        actualizarRectangulos();
    }//GEN-LAST:event_btnActualizarRectanguloActionPerformed

    private void tblRectangulosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRectangulosMouseClicked
        // TODO add your handling code here:
         int fila = tblRectangulos.getSelectedRow();
        //dtm.setValueAt(objeto, fila, columna);
        txtAncho.setText((String) dtm.getValueAt(fila, 0));
        txtAlto.setText((String) dtm.getValueAt(fila, 1));
        //JOptionPane.showMessageDialog(null, "SELECCIONADA ANCHO: " + cadena);        
    }//GEN-LAST:event_tblRectangulosMouseClicked

    private void btnEliminarTodosRetangulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTodosRetangulosActionPerformed
        // TODO add your handling code here:
        limpiarCuadrado();
    }//GEN-LAST:event_btnEliminarTodosRetangulosActionPerformed

    private void btnCalcularTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularTrianguloActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnCalcularTrianguloActionPerformed

    public void calcularFormulasTriangulo(){
        //mis forumulas
        double base   = Double.parseDouble(txtBase.getText());
        double altura = Double.parseDouble(txtAltura.getText());
        
        double area = (base * altura) / 2;
        
        lblArea.setText(String.valueOf(area));
        //double base = Double.parseDouble (nombreObjeto.getText());
        
    
    }
    
    private void btnCalcularTrianguloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcularTrianguloMouseClicked
        // TODO add your handling code here:
        calcularFormulasTriangulo();
    }//GEN-LAST:event_btnCalcularTrianguloMouseClicked

    public void limpiarCuadrado(){
        //int filas = tblRectangulos.getRowCount();
        int filas = dtm.getRowCount();
        for (int i=0; i<filas; i++){
           dtm.removeRow(0);
        }
    }
    
    public void actualizarRectangulos(){
        int fila = tblRectangulos.getSelectedRow();
        //dtm.setValueAt(objeto, fila, columna);
        if (! (fila >=0))
            JOptionPane.showMessageDialog(null, "SELECCIONAR LA FILA A ACTUALIZAR");
        else if (! txtAncho.getText().equals("") && 
                 ! txtAlto.getText().equals("")) {
                dtm.setValueAt(txtAncho.getText(), fila, 0);
                dtm.setValueAt(txtAlto.getText(), fila, 1);
                dtm.setValueAt(txtArea.getText(), fila, 2);
                dtm.setValueAt(lblPerimetro.getText(), fila, 3);
            }
            else
                JOptionPane.showMessageDialog(null, "COMPLETAR LOS CAMPOS DEL FORMULARIO");
   }
    
    public void eliminarRectangulo(){
        int fila = tblRectangulos.getSelectedRow();
        //confirmar
        if (fila >=0){
            int opcion = JOptionPane.showConfirmDialog(null, "SEGURO DE ELIMINAR?");
            //System.out.println("opcion: " + opcion);
            if (opcion == 0) dtm.removeRow(fila);
        }
        else
        JOptionPane.showMessageDialog(null, "SELECCIONAR LA FILA A ELIMINAR");
    }
    
    
    public void insertarRectangulo(){
        //alternative 1 creando todo al tiempo
        /*dtm.addRow(new Object[]{
        txtAncho.getText(),
        txtLargo.getText(),
        txtArea.getText(),
        txtPerimetro.getText()
        });*/
        //alternative 2, creando por partes
        String[] datos = new String[5];
        datos[0] = txtAncho.getText();
        datos[1] = txtAlto.getText();
        datos[2] = txtArea.getText();
        datos[3] = lblPerimetro.getText();
        dtm.addRow(datos);
        limpiarCajas();
    }
    
    public void activarBotones(){
      if (! txtAncho.getText().equals("") && 
          ! txtAlto.getText().equals("")) 
        btnCalcular.setEnabled(true);
      else btnCalcular.setEnabled(false);
    }
    
    public void limpiarCajas(){
       txtAncho.setText("");
       txtAlto.setText("");
       lblPerimetro.setText("");
       txtArea.setText("");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmFiguras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarRectangulo;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCalcularTriangulo;
    private javax.swing.JButton btnEliminarCuadrado;
    private javax.swing.JButton btnEliminarTodosRetangulos;
    private javax.swing.JButton btnInsertarRectangulo;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboTriangulos;
    private javax.swing.JComboBox<String> cboTrianguloss;
    private javax.swing.JCheckBox chkConos;
    private javax.swing.JCheckBox chkEquilatero;
    private javax.swing.JCheckBox chkEquilateros;
    private javax.swing.JCheckBox chkEscaleno;
    private javax.swing.JCheckBox chkEscalenos;
    private javax.swing.JCheckBox chkIsosceles;
    private javax.swing.JCheckBox chkIsosceless;
    private javax.swing.JButton cmdCheckBox;
    private javax.swing.JButton cmdCheckBoxs;
    private javax.swing.JButton cmdComboBoxs;
    private javax.swing.JButton cmdCombos;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdRadios;
    private javax.swing.JButton cmdRadioss;
    private javax.swing.ButtonGroup gradTriangulos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblPerimetro;
    private javax.swing.JLabel lblTildeAlto;
    private javax.swing.JLabel lblTildeAncho;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JRadioButton radCono;
    private javax.swing.JRadioButton radEquilatero;
    private javax.swing.JRadioButton radEquilateross;
    private javax.swing.JRadioButton radEscaleno;
    private javax.swing.JRadioButton radEscalenos;
    private javax.swing.JRadioButton radIsosceles;
    private javax.swing.JRadioButton radIsosceless;
    private javax.swing.JTable tblRectangulos;
    private javax.swing.JTextField txtAlto;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtAncho;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtBase;
    private javax.swing.JTextField txtLado1;
    private javax.swing.JTextField txtLado2;
    // End of variables declaration//GEN-END:variables
}
