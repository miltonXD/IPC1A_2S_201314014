package hotelCentroamerica;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;
public class Menu extends JFrame implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel pnlHabitacion,pnlhotel,pnlCliente,pnlReservacion,pnlPromocion,pnlRestaurante,pnlServicio,pnlcontrolre,pnlagregarcobro;
	JTabbedPane MenuHotel;
	private JTextField txtid, txtnombre,txtpais,txtdireccion,txttelefono;
	JTable tabla,tablareservacion,tablaservicio; 
	private JLabel lblid, lblnombre,lblpais,lbldireccion,lbltelefono,lblnhotel,lfi,lff,ld,lnp,lpais;
	private JLabel lblFechaEntrada,lblFechaSalida,lblhotel,dpi,nombre,apellido,dpi2,nombre2,apellido2;
	private JLabel lblidhabitacion,tipo,precio,lblidhotel,estado,edificio,nivel,ncamas,anuncio,anuncio2;
	private JTextField txtidhabitacion,txtprecio,txtedificio,txtnivel,txtncamas,txtnit,txtclienten,txtapellido,txtnit2,txtclienten2,txtapellido2;
	JButton btnAgregarHotel,btnAgregarReservacion,btndisponibilidad,btnagregarH,btnagregarC,buscar,verificars;
	JLabel nombrer,especialidad,capacidad,ubicacion,horario,lblhotel2,lblprecio,capacidad2,descripcion,precio2,nombre3;
	JTextField txtnombrer,txtespecialidad,txtcapacidad,txtubicacion,txthorario,txtcapacidad2,txtprecio2,txtnombre2,dias,npersonas,txpais,txprecio;
	JTextField txtcobro,txtpreciop;
	JTextArea txtdes;
	JLabel inicialf,finalf,tipoc,A,B,listar,lblprecioplbldes,lbldes;
	JTextArea txtdescripcion;
	JButton btnBuscar,btnLimpiar,rrestaurante,rservicio,rpromocion;
	JButton rcliente,buscarCliente,actualizar,eliminar,consultarPromocion,agregarServ,buscarpromo;
	JDateChooser dateChooser,dateChooser2,fi,ff,cf1,cf2;
	JComboBox<String> comboBox,tipoH,estadoH,hotel3,hotel4,hotel5,estadoc,restaurantel,hotel7,serviciol;
	JComboBox<Integer> hotelid,hotelcliente;
	ListaHotel listahotel=new ListaHotel();
	DefaultTableModel md;
	DefaultTableModel md2;
	DefaultTableModel md3;
	String data[][]={};
	String cabeza[]={"ID","precio","estado","tipo","nivel","edificio","No camas"};
	String data2[][]={};
	String cabeza2[]={"ID","Fecha entrada","Fecha salida","ID.Hab","Tipo","Nombre cliente","Monto"};
	String data3[][]={};
	String cabeza3[]={"Nombre Servicio","Precio"};
    JLabel prueba,cobro;
	String estadot,tipot,nivelt,edificiot,estadop,tipohab;
	int i,i2,preciot,camast,h;
	int c=0;
	int c1=0;
	 boolean x=false;
	private JButton agregarcc;
	private JLabel dpi3;
	private JLabel nombre33;
	private JLabel apellido3;
	private JTextField txtnit3;
	private JButton buscar3;
	private JTextField txtnombre3;
	private JTextField txtapellido3;
	private JLabel eh;
	private boolean z;
	private JLabel lblpreciop;
    ListaPromocion listapromocion = new ListaPromocion();
	public Menu()
	{
		 Dimension d = new Dimension();
		 setLocation((int) ((d.getWidth()/2)+360), 20);
		this.setTitle("Hotel De Centroamerica");
		this.setSize(700,700);
		 setDefaultCloseOperation(0);//finaliza el programa cuando se da click en la X
	     setResizable(false);//quita la opcion de cambiar tamanño
		
		MenuHotel= new JTabbedPane();
        Dimension size = new Dimension(380,380);
        MenuHotel.setMaximumSize(size);
        MenuHotel.setPreferredSize(size);
        MenuHotel.setMinimumSize(size);		
        //formulario de ingreso de hoteles
        md= new DefaultTableModel(data,cabeza);
        md2=new DefaultTableModel(data2,cabeza2);
		lblid=new JLabel("ID");
		lblid.setBounds(new Rectangle(190,20,80,20));
		lblnombre=new JLabel("Nombre");
		lblnombre.setBounds(new Rectangle(190,50,80,20));
		lblpais=new JLabel("Pais");
		lblpais.setBounds(new Rectangle(190,80,80,20));
		lbldireccion=new JLabel("Direccion");
		lbldireccion.setBounds(new Rectangle(190,110,80,20));
		lbltelefono=new JLabel("Telefono");
		lbltelefono.setBounds(new Rectangle(190,140,80,20));
		txtid=new JTextField("");
		txtid.setBounds(new Rectangle(290,20,125,20));
		txtnombre=new JTextField("");
		txtnombre.setBounds(new Rectangle(290,50,125,20));
		txtpais=new JTextField("");
		txtpais.setBounds(290,80,125,20);
		txtdireccion=new JTextField("");
		txtdireccion.setBounds(new Rectangle(290,110,125,20));
		txttelefono=new JTextField("");
		txttelefono.setBounds(new Rectangle(290,140,125,20));
		btnAgregarHotel=new JButton("Registrar");
		btnAgregarHotel.setBounds(new Rectangle(250,200,100,20));
		btnAgregarHotel.addActionListener(this);
		pnlhotel=new JPanel();
		pnlhotel.setLayout(null);
		pnlhotel.add(lblid);
		pnlhotel.add(lblnombre);
		pnlhotel.add(lblpais);
		pnlhotel.add(lbldireccion);
		pnlhotel.add(lbltelefono);
		pnlhotel.add(txtid);
		pnlhotel.add(txtnombre);
		pnlhotel.add(txtpais);
		pnlhotel.add(txtdireccion);
		pnlhotel.add(txttelefono);
		pnlhotel.add(btnAgregarHotel);
		MenuHotel.addTab("Reg Hotel ",pnlhotel);
		
		//reservaciones
		prueba= new JLabel("");
		prueba.setBounds(new Rectangle(280,490,80,20));
		cobro= new JLabel("Cobrar");
		cobro.setBounds(new Rectangle(100,530,80,20));
		txtcobro= new JTextField("");
		txtcobro.setBounds(new Rectangle(281,530,80,20));
		lblprecio =new JLabel("Monto de reservacion Q");
		lblprecio.setBounds(new Rectangle(100,490,180,20));
		tabla = new JTable( );
		tabla.setModel(md);
		JScrollPane panel = new JScrollPane( tabla );
		panel.setBounds(new Rectangle(100,165,500,200));
		//tabla de habitaciones
		tabla.addMouseListener(new MouseAdapter() 
		   {
		      public void mouseClicked(MouseEvent e) 
		      {		
		    	 int row = tabla.getSelectedRow();
		    	  i=Integer.parseInt(tabla.getValueAt(row, 0).toString());
                  preciot=Integer.parseInt(tabla.getValueAt(row, 1).toString());
                  estadot="ocupado";
                  estadop=tabla.getValueAt(row, 2).toString();
                  tipot=tabla.getValueAt(row, 3).toString();
                  nivelt=tabla.getValueAt(row, 4).toString();
                  edificiot=tabla.getValueAt(row, 5).toString();
                  camast=Integer.parseInt(tabla.getValueAt(row, 6).toString());
		      }
		   });
		dpi2=new JLabel("NIT");
		dpi2.setBounds(new Rectangle(100,50,80,20));
		nombre2=new JLabel("Nombres");
		nombre2.setBounds(new Rectangle(100,80,80,20));
		apellido2=new JLabel("Apellidos");
		apellido2.setBounds(new Rectangle(280,80,80,20));
		txtnit2=new JTextField("");
		txtnit2.setBounds(new Rectangle(170,50,80,20));
		buscarCliente=new JButton("Buscar Cliente");
		buscarCliente.setBounds(new Rectangle(280,50,120,20));
		buscarCliente.addActionListener(this);
		txtclienten2=new JTextField("");
		txtclienten2.setBounds(new Rectangle(170,80,80,20));
		txtapellido2=new JTextField("");
		txtapellido2.setBounds(350,80,80,20);
		comboBox = new JComboBox<String>();
		comboBox.setBounds(280, 20, 127, 20);
		consultarPromocion= new JButton("Consultar promo");
		consultarPromocion.setBounds(350, 20, 127, 20);
		consultarPromocion.addActionListener(this);
		lblhotel=new JLabel("Eliga un Hotel");
		lblhotel.setBounds(new Rectangle(100,20,120,20));
		lblFechaEntrada=new JLabel("Fecha de entrada");
		lblFechaEntrada.setBounds(new Rectangle(100,380,120,20));
		lblFechaSalida=new JLabel("Fecha de salida");
		lblFechaSalida.setBounds(new Rectangle(100,420,120,20));
		dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("dd/MM/yyyy");
		dateChooser.setBounds(280, 380, 127, 20);
		dateChooser2 = new JDateChooser();
		dateChooser2.setDateFormatString("dd/MM/yyyy");
		dateChooser2.setBounds(280, 420, 127, 20);
		btnAgregarReservacion=new JButton("Registrar Reserva");
		btnAgregarReservacion.setBounds(new Rectangle(270,570,180,30));
		btnAgregarReservacion.addActionListener(this);
		buscar=new JButton("Buscar Habitaciones");
		buscar.setBounds(new Rectangle(250,125,170,24));
		buscar.addActionListener(this);
		buscarpromo=new JButton("Buscar promo");
		buscarpromo.setBounds(new Rectangle(450,125,170,24));
		buscarpromo.addActionListener(this);
		btndisponibilidad= new JButton("Calcular cobro");
		btndisponibilidad.setBounds(new Rectangle(150,465,180,20));
		btndisponibilidad.addActionListener(this);
		rcliente= new JButton("Registrar C");
		rcliente.setBounds(new Rectangle(450,50,120,20));
		rcliente.addActionListener(this);
		rcliente.setEnabled(false);
		pnlReservacion=new JPanel();
		pnlReservacion.setLayout(null);
		pnlReservacion.add(buscarpromo);
		pnlReservacion.add(lblFechaEntrada);
		pnlReservacion.add(lblFechaSalida);
		pnlReservacion.add(btnAgregarReservacion);
		pnlReservacion.add(dateChooser);
		pnlReservacion.add(dateChooser2);
		pnlReservacion.add(comboBox);
		pnlReservacion.add(lblhotel);
		pnlReservacion.add(btndisponibilidad);
		pnlReservacion.add(panel);
		pnlReservacion.add(buscar);
		pnlReservacion.add(dpi2);
		pnlReservacion.add(nombre2);
		pnlReservacion.add(apellido2);
		pnlReservacion.add(txtnit2);
		pnlReservacion.add(txtclienten2);
		pnlReservacion.add(txtapellido2);
		pnlReservacion.add(buscarCliente);
		pnlReservacion.add(rcliente);
		pnlReservacion.add(prueba);
		pnlReservacion.add(lblprecio);
		pnlReservacion.add(txtcobro);
		pnlReservacion.add(cobro);
		MenuHotel.addTab("Reg Reservacion",pnlReservacion);
		
		
		//habitacion
		lblidhabitacion=new JLabel("ID");
		lblidhabitacion.setBounds(new Rectangle(100,20,120,20));
		lblidhotel= new JLabel("ID hotel");
		lblidhotel.setBounds(new Rectangle(100,50,120,20));
		tipo= new JLabel("Tipo");
		tipo.setBounds(new Rectangle(100,80,120,20));
		estado= new JLabel("Estado");
		estado.setBounds(new Rectangle(100,110,120,20));
		precio= new JLabel("Precio");
		precio.setBounds(new Rectangle(100,140,120,20));
		edificio= new JLabel("Edificio");
		edificio.setBounds(new Rectangle(100,170,120,20));
		nivel= new JLabel("Nivel");
		nivel.setBounds(new Rectangle(100,200,120,20));
		ncamas= new JLabel("No.camas");
		ncamas.setBounds(new Rectangle(100,230,120,20));
		txtidhabitacion=new JTextField("");
		txtidhabitacion.setBounds(new Rectangle(160,20,120,20));
		hotelid= new JComboBox();
		hotelid.setBounds(new Rectangle(160,50,120,20));
		tipoH= new JComboBox<String>();
		tipoH.setBounds(new Rectangle(160,80,120,20));
		tipoH.addItem("Sencilla");
		tipoH.addItem("Regular");
		tipoH.addItem("Exclusiva");
		estadoH= new JComboBox<String>();
		estadoH.setBounds(new Rectangle(160,110,120,20));
		estadoH.addItem("Disponible");
		estadoH.addItem("Ocupado");
		txtprecio= new JTextField("");
		txtprecio.setBounds(new Rectangle(160,140,120,20));
		txtedificio= new JTextField("");
		txtedificio.setBounds(new Rectangle(160,170,120,20));
		txtnivel= new JTextField("");
		txtnivel.setBounds(new Rectangle(160,200,120,20));
		txtncamas= new JTextField("");
		txtncamas.setBounds(new Rectangle(160,230,120,20));
		btnagregarH= new JButton("Agregar");
		btnagregarH.setBounds(new Rectangle(200,300,100,20));
		btnagregarH.addActionListener(this);
		pnlHabitacion = new JPanel();
		pnlHabitacion.setLayout(null);
		pnlHabitacion.add(lblidhabitacion);
		pnlHabitacion.add(lblidhotel);
		pnlHabitacion.add(tipo);
		pnlHabitacion.add(estado);
		pnlHabitacion.add(precio);
		pnlHabitacion.add(edificio);
		pnlHabitacion.add(nivel);
		pnlHabitacion.add(ncamas);
		pnlHabitacion.add(txtprecio);
		pnlHabitacion.add(txtedificio);
		pnlHabitacion.add(txtnivel);
		pnlHabitacion.add(txtncamas);
		pnlHabitacion.add(estadoH);
		pnlHabitacion.add(tipoH);
		pnlHabitacion.add(txtidhabitacion);
		pnlHabitacion.add(hotelid);
		pnlHabitacion.add(btnagregarH);
		MenuHotel.addTab("Reg habitaciones",pnlHabitacion);
		// formulario del cliente
		dpi=new JLabel("NIT");
		dpi.setBounds(new Rectangle(180,50,80,20));
		nombre=new JLabel("Nombres");
		nombre.setBounds(new Rectangle(180,80,80,20));
		apellido=new JLabel("Apellidos");
		apellido.setBounds(new Rectangle(180,110,80,20));
		txtnit=new JTextField("");
		txtnit.setBounds(new Rectangle(290,50,180,20));
		txtclienten=new JTextField("");
		txtclienten.setBounds(new Rectangle(290,80,180,20));
		txtapellido=new JTextField("");
		txtapellido.setBounds(290,110,180,20);
		pnlCliente = new JPanel();
		pnlCliente.setLayout(null);
		btnagregarC= new JButton("Registrar");
		btnagregarC.setBounds(new Rectangle(275,150,100,20));
		btnagregarC.addActionListener(this);
		hotelcliente = new JComboBox<Integer>();
		hotelcliente.setBounds(new Rectangle(290,20,120,20));
		lblnhotel =new  JLabel("ID de hotel");
		lblnhotel.setBounds(new Rectangle(180,20,120,20));
		inicialf = new JLabel("Fecha inicial");
		inicialf.setBounds(new Rectangle(180,250,120,20));
		finalf=new JLabel("Fecha final");
		finalf.setBounds(new Rectangle(180,280,120,20));
		cf1= new JDateChooser();
		cf1.setBounds(new Rectangle(350,250,120,20));
		cf1.setDateFormatString("dd/MM/yyyy");
		cf2= new JDateChooser();
		cf2.setBounds(new Rectangle(350,280,120,20));
		cf2.setDateFormatString("dd/MM/yyyy");
		tipoc= new JLabel("Tipo de habitacion");
		tipoc.setBounds(new Rectangle(180,310,120,20));
		estadoc = new JComboBox<String>();
		estadoc.addItem("Sencilla");
		estadoc.addItem("Regular");
		estadoc.addItem("Exclusiva");
		estadoc.setBounds(new Rectangle(350,310,120,20));
		agregarcc= new JButton("Agregar a cola");
		agregarcc.setBounds(new Rectangle(265,360,120,20));
		agregarcc.addActionListener(this);
		A = new JLabel("Cola de Espera");
		A.setBounds(new Rectangle(275,200,120,20));
		B = new JLabel("----------------------------------------------------------------------------------------------------");
		B.setBounds(new Rectangle(120,180,470,20));
		pnlCliente.add(btnagregarC);
		pnlCliente.add(dpi);
		pnlCliente.add(lblnhotel);
		pnlCliente.add(nombre);
		pnlCliente.add(apellido);
		pnlCliente.add(txtnit);
		pnlCliente.add(txtclienten);
		pnlCliente.add(txtapellido);
		pnlCliente.add(hotelcliente);
		pnlCliente.add(inicialf);
		pnlCliente.add(finalf);
		pnlCliente.add(tipoc);
		pnlCliente.add(cf1);
		pnlCliente.add(cf2);
		pnlCliente.add(A);
		pnlCliente.add(agregarcc);
		pnlCliente.add(B);
		pnlCliente.add(estadoc);
		MenuHotel.addTab("Reg cliente y cola",pnlCliente);
		    
               //promocion
		   lpais=new JLabel("Pais");
		   lpais.setBounds(new Rectangle(170,70,120,20));
		   txpais=new JTextField("");
		   txpais.setBounds(270,70,80,20);
		   lfi=new JLabel("Fecha inicio");
		   lfi.setBounds(new Rectangle(170,100,120,20));
	       lff=new JLabel("Fecha final");
		   lff.setBounds(new Rectangle(170,130,120,20));
		   ld=new JLabel("Dias");
		   ld.setBounds(new Rectangle(170,160,80,20));
		   lnp=new JLabel("No. personas");
		   lnp.setBounds(new Rectangle(170,190,80,20));
		    fi=new JDateChooser();
		    fi.setDateFormatString("dd/MM/yyyy");
		    fi.setBounds(new Rectangle(270,100,140,20));
		    ff=new JDateChooser();
		    ff.setDateFormatString("dd/MM/yyyy");
		    ff.setBounds(new Rectangle(270,130,140,20));
		    dias=new JTextField("");
			dias.setBounds(270,160,80,20);
			npersonas=new JTextField("");
			npersonas.setBounds(270,190,80,20);
		    rpromocion= new JButton("Registrar Promocion");
			rpromocion.setBounds(new Rectangle(200,350,190,20));
			rpromocion.addActionListener(this);
			lblpreciop= new JLabel("Precio");
			lblpreciop.setBounds(new Rectangle(170,220,80,20));
			txtpreciop=new JTextField("");
			txtpreciop.setBounds(270,220,80,20);
			lbldes= new JLabel("Descripcion");
			lbldes.setBounds(new Rectangle(170,250,80,30));
			txtdes=new JTextArea("");
			txtdes.setBounds(270,250,190,40);
	        pnlPromocion = new JPanel();
			pnlPromocion.setLayout(null);
			pnlPromocion.add(fi);
			pnlPromocion.add(ff);
			pnlPromocion.add(rpromocion);
			pnlPromocion.add(dias);
			pnlPromocion.add(npersonas);
			pnlPromocion.add(lfi);
			pnlPromocion.add(lff);
			pnlPromocion.add(ld);
			pnlPromocion.add(lnp);
			pnlPromocion.add(txtdes);
			pnlPromocion.add(lbldes);
			pnlPromocion.add(lnp);
			pnlPromocion.add(lpais);
			pnlPromocion.add(txpais);
			pnlPromocion.add(lblpreciop);
			pnlPromocion.add(txtpreciop);
			
			MenuHotel.addTab("Reg Promociones y paquetes",pnlPromocion);
			
			
			//Restaurantes
			nombrer=new JLabel("Nombre del restaurante");
			nombrer.setBounds(new Rectangle(150,80,150,20));
			txtnombrer=new JTextField("");
			txtnombrer.setBounds(new Rectangle(320,80,150,20));
			especialidad=new JLabel("Especialidad");
			especialidad.setBounds(new Rectangle(150,110,150,20));
			txtespecialidad=new JTextField("");
			txtespecialidad.setBounds(new Rectangle(320,110,150,20));
			capacidad=new JLabel("Capacidad");
			capacidad.setBounds(new Rectangle(150,140,150,20));
			txtcapacidad=new JTextField("");
			txtcapacidad.setBounds(new Rectangle(320,140,150,20));
			horario=new JLabel("Horario de atencion");
			horario.setBounds(new Rectangle(150,170,150,20));
			txthorario=new JTextField("");
			txthorario.setBounds(new Rectangle(320,170,150,20));
			ubicacion=new JLabel("Ubicacion");
			ubicacion.setBounds(new Rectangle(150,200,150,20));
			txtubicacion=new JTextField("");
			txtubicacion.setBounds(new Rectangle(320,200,150,20));
			hotel4 = new JComboBox<String>();
			hotel4.setBounds(320, 25, 127, 20);
			lblhotel2=new JLabel("Eliga un Hotel");
			lblhotel2.setBounds(new Rectangle(150,25,120,20));
			rrestaurante= new JButton("Agregar Restaurante");
			rrestaurante.setBounds(new Rectangle(220,290,180,20));
			rrestaurante.addActionListener(this);
			restaurantel= new JComboBox<String>();
			restaurantel.setBounds(new Rectangle(360,350,100,20));
			listar=new JLabel("Lista de restaurantes registrados");
			listar.setBounds(new Rectangle(140,350,200,20));
			pnlRestaurante = new JPanel();
			pnlRestaurante.setLayout(null);
			pnlRestaurante.add(nombrer);
			pnlRestaurante.add(txtnombrer);
			pnlRestaurante.add(especialidad);
			pnlRestaurante.add(txtespecialidad);
			pnlRestaurante.add(capacidad);
			pnlRestaurante.add(txtcapacidad);
			pnlRestaurante.add(ubicacion);
			pnlRestaurante.add(txtubicacion);
			pnlRestaurante.add(horario);
			pnlRestaurante.add(txthorario);
			pnlRestaurante.add(lblhotel2);
			pnlRestaurante.add(hotel4);
			pnlRestaurante.add(rrestaurante);
			pnlRestaurante.add(restaurantel);
			pnlRestaurante.add(listar);
			MenuHotel.addTab("Reg Restaurantes",pnlRestaurante);
			
			//servicio
			anuncio2 = new JLabel("Eliga hotel");
			anuncio2.setBounds(new Rectangle(150,25,120,20));
			hotel5 = new JComboBox<String>();
			hotel5.setBounds(320, 25, 127, 20);
			rservicio= new JButton("Agregar Servicio");
			rservicio.setBounds(new Rectangle(230,300,180,20));
			rservicio.addActionListener(this);
			nombre3=new JLabel("Nombre del Sercivio");
			nombre3.setBounds(new Rectangle(150,80,150,20));
			txtnombre2=new JTextField("");
			txtnombre2.setBounds(new Rectangle(320,80,150,20));
			capacidad2=new JLabel("Capacidad");
			capacidad2.setBounds(new Rectangle(150,110,150,20));
			txtcapacidad2=new JTextField("");
			txtcapacidad2.setBounds(new Rectangle(320,110,150,20));
			descripcion=new JLabel("Descripcion");
			descripcion.setBounds(new Rectangle(150,140,150,20));
			txtdescripcion=new JTextArea("");
			txtdescripcion.setBounds(new Rectangle(320,140,150,50));
			precio2=new JLabel("Precio");
			precio2.setBounds(new Rectangle(150,210,150,20));
			txtprecio2=new JTextField("");
			txtprecio2.setBounds(new Rectangle(320,210,150,20));
			pnlServicio = new JPanel();
			pnlServicio.setLayout(null);
			pnlServicio.add(rservicio);
			pnlServicio.add(nombre3);
			pnlServicio.add(txtnombre2);
			pnlServicio.add(capacidad2);
			pnlServicio.add(txtcapacidad2);
			pnlServicio.add(descripcion);
			pnlServicio.add(txtdescripcion);
			pnlServicio.add(precio2);
			pnlServicio.add(txtprecio2);
			pnlServicio.add(hotel5);
			pnlServicio.add(anuncio2);
			MenuHotel.addTab("Reg Servicios",pnlServicio);
			
			actualizar= new JButton("Actualizar");
			actualizar.setBounds(new Rectangle(280,60,100,20));
			eliminar= new JButton("Cancelar reservacion");
			eliminar.setBounds(new Rectangle(250,500,170,25));
			actualizar.addActionListener(this);
			eliminar.addActionListener(this);
			pnlcontrolre = new JPanel();
			pnlcontrolre.setLayout(null);
			tablareservacion = new JTable( );
			tablareservacion.setModel(md2);
			JScrollPane panel2 = new JScrollPane( tablareservacion );
			panel2.setBounds(new Rectangle(25,100,640,350));
			tablareservacion.addMouseListener(new MouseAdapter() 
			   {
			      public void mouseClicked(MouseEvent e) 
			      {		
			    	 int row = tablareservacion.getSelectedRow();
			    	  i2=Integer.parseInt(tablareservacion.getValueAt(row, 0).toString());
			    	  h=Integer.parseInt(tablareservacion.getValueAt(row, 3).toString());
	                  tipohab=tablareservacion.getValueAt(row, 4).toString();
			      }
			   });
			hotel3 = new JComboBox<String>();
			hotel3.setBounds(new Rectangle(50,20,120,20));
			anuncio = new JLabel("Eliga hotel");
			anuncio.setBounds(new Rectangle(190,20,120,20));
			pnlcontrolre.add(panel2);
			pnlcontrolre.add(actualizar);
			pnlcontrolre.add(hotel3);
			pnlcontrolre.add(anuncio);
			pnlcontrolre.add(eliminar);
			MenuHotel.addTab("Control de reservaciones",pnlcontrolre);
			
			//cobros
			hotel7 = new JComboBox<String>();
			hotel7.setBounds(new Rectangle(270,20,130,25));
			serviciol= new JComboBox<String>();
			serviciol.setBounds(new Rectangle(270,150,130,25));
			verificars= new JButton("servicios en hotel");
			verificars.setBounds(new Rectangle(430,20,230,25));
			verificars.addActionListener(this);
			eh= new JLabel("Eliga hotel");
			eh.setBounds(new Rectangle(100,20,80,20));
			dpi3=new JLabel("NIT");
			dpi3.setBounds(new Rectangle(100,70,80,20));
			nombre33=new JLabel("Nombres");
			nombre33.setBounds(new Rectangle(100,100,80,20));
			apellido3=new JLabel("Apellidos");
			apellido3.setBounds(new Rectangle(280,100,80,20));
			txtnit3=new JTextField("");
			txtnit3.setBounds(new Rectangle(170,70,80,20));
			buscar3=new JButton("Buscar Cliente");
			buscar3.setBounds(new Rectangle(280,70,160,20));
			buscar3.addActionListener(this);
			txtnombre3=new JTextField("");
			txtnombre3.setBounds(new Rectangle(170,100,80,20));
			txtapellido3=new JTextField("");
			txtapellido3.setBounds(350,100,80,20);
			agregarServ=new JButton("Agregar servicio a cuenta");
			agregarServ.setBounds(450,150,180,20);
			agregarServ.addActionListener(this);
			md3= new DefaultTableModel(data3,cabeza3);
			tablaservicio= new JTable();
			tablaservicio.setModel(md3);
			JScrollPane panel3 = new JScrollPane( tablaservicio );
			panel3.setBounds(220,250,230,200);
			pnlagregarcobro = new JPanel();
			pnlagregarcobro.setLayout(null);
			pnlagregarcobro.add(eh);
			pnlagregarcobro.add(dpi3);
			pnlagregarcobro.add(nombre33);
			pnlagregarcobro.add(apellido3);
			pnlagregarcobro.add(txtnit3);
			pnlagregarcobro.add(buscar3);
			pnlagregarcobro.add(txtnombre3);
			pnlagregarcobro.add(txtapellido3);
			pnlagregarcobro.add(hotel7);
			pnlagregarcobro.add(serviciol);
			pnlagregarcobro.add(verificars);
			pnlagregarcobro.add(agregarServ);
			pnlagregarcobro.add(panel3);
			MenuHotel.addTab("Cobros",pnlagregarcobro);
		
			this.getContentPane().add(MenuHotel);
			addWindowListener(new manVentana());
	}
 
	public void actionPerformed(ActionEvent e) {
		   //agregar hotel
		if (e.getSource()==btnAgregarHotel) {
		try{
		if(((listahotel.buscarid(Integer.parseInt(txtid.getText())))==false)&&(listahotel.buscarnombre(txtnombre.getText())==false)){
			Hotel hotel = new Hotel();
			if (!"".equals(txtid.getText())){
				hotel.setId(Integer.parseInt(txtid.getText()));
				}
				if (!"".equals(txtnombre.getText())){
				hotel.setNombre(txtnombre.getText());
				}
				if (!"".equals(txtpais.getText())){
				hotel.setPais(txtpais.getText());
				}
				if (!"".equals(txtdireccion.getText())){
				hotel.setDireccion(txtdireccion.getText());
				}
				if (!"".equals(txttelefono.getText())){
				hotel.setTelefono(txttelefono.getText());
				}
				listahotel.agregar(hotel);
				comboBox.removeAllItems();
				hotelid.removeAllItems();
				hotelcliente.removeAllItems();
				hotel3.removeAllItems();
				hotel4.removeAllItems();
				hotel5.removeAllItems();
				hotel7.removeAllItems();
				for (int i=0;i<listahotel.tamano();i++){
					hotelid.addItem(listahotel.obtener(i).getId());
				}
				for (int i=0;i<listahotel.tamano();i++){
					comboBox.addItem(listahotel.obtener(i).getNombre());
				}
				for (int i=0;i<listahotel.tamano();i++){
					hotelcliente.addItem(listahotel.obtener(i).getId());
				}
				for (int i=0;i<listahotel.tamano();i++){
					hotel3.addItem(listahotel.obtener(i).getNombre());
				}
				for (int i=0;i<listahotel.tamano();i++){
					hotel4.addItem(listahotel.obtener(i).getNombre());
				}
				for (int i=0;i<listahotel.tamano();i++){
					hotel5.addItem(listahotel.obtener(i).getNombre());
				}
				for (int i=0;i<listahotel.tamano();i++){
					hotel7.addItem(listahotel.obtener(i).getNombre());
				}
				txtid.setText("");
				txtpais.setText("");
				txtdireccion.setText("");
				txtnombre.setText("");
				txttelefono.setText("");
				JOptionPane.showMessageDialog(null,"Hotel registrado con exito","Mensaje", JOptionPane.INFORMATION_MESSAGE);
		}else{
			JOptionPane.showMessageDialog(null,"ID o nombre ya existen","Error", JOptionPane.INFORMATION_MESSAGE);
		}
		}catch(Exception i){ 
        	JOptionPane.showMessageDialog(null,"El Archivo Incorrecto,se cerrara el programa","Error", JOptionPane.INFORMATION_MESSAGE);
	    }
	}
		
		//agrega habitacion
		if (e.getSource()==btnagregarH) {
			int  id=(int) hotelid.getSelectedItem();
			if(listahotel.buscar(id).listaHabitacion.buscarid(Integer.parseInt(txtidhabitacion.getText()))==false){
			Habitacion habitacion = new Habitacion();
			String estado=estadoH.getSelectedItem().toString();
			String tipo=tipoH.getSelectedItem().toString();
			if (!"".equals(txtidhabitacion.getText())){
				habitacion.setNumero(Integer.parseInt(txtidhabitacion.getText()));
				}
		    habitacion.setTipo(tipo);
		    habitacion.setEstado(estado);
		    if (!"".equals(txtedificio.getText())){
		    habitacion.setEdificio(txtedificio.getText());
		    }
		    if (!"".equals(txtprecio.getText())){
			    habitacion.setPrecio(Integer.parseInt(txtprecio.getText()));
			    }
		    if (!"".equals(txtncamas.getText())){
			    habitacion.setNumeroCamas((Integer.parseInt(txtncamas.getText())));
			    }
		    if (!"".equals(txtnivel.getText())){
		    habitacion.setNivel(txtnivel.getText());
		    }
			listahotel.buscar(id).listaHabitacion.agregar(habitacion);
			txtedificio.setText("");
			txtidhabitacion.setText("");
			txtprecio.setText("");
			txtnivel.setText("");
			txtncamas.setText("");
			JOptionPane.showMessageDialog(null,"habitacion resgistrada","Mensaje", JOptionPane.INFORMATION_MESSAGE);
			}else{
				JOptionPane.showMessageDialog(null,"id o numero de habitacion ya existe","Error", JOptionPane.INFORMATION_MESSAGE);
			}
	    }
		//boton de buscar habitacion
		if (e.getSource()==buscar) {
			  int a =md.getRowCount()-1; 
		         for(int w=a;w>=0;w--){  
		             md.removeRow(w);
		         }
		     String eleccion=comboBox.getSelectedItem().toString();
			System.out.println(eleccion);
			for (int i=0;i<listahotel.buscar(eleccion).listaHabitacion.tamano();i++){
			Object Datos[]={listahotel.buscar(eleccion).listaHabitacion.obtener(i).getNumero(),listahotel.buscar(eleccion).listaHabitacion.obtener(i).getPrecio(),
					listahotel.buscar(eleccion).listaHabitacion.obtener(i).getEstado(),listahotel.buscar(eleccion).listaHabitacion.obtener(i).getTipo(),
					listahotel.buscar(eleccion).listaHabitacion.obtener(i).getNivel(),listahotel.buscar(eleccion).listaHabitacion.obtener(i).getEdificio(),
					listahotel.buscar(eleccion).listaHabitacion.obtener(i).getNumeroCamas()};
			md.addRow(Datos);
			}
	}
		//agragar cliente
     if (e.getSource()==btnagregarC) {	
    	 
    	 int  id2=(int) hotelcliente.getSelectedItem();
    	 if( listahotel.buscar(id2).listCliente.buscarnit(txtnit.getText())==false){
    	 Cliente cliente = new Cliente();
    	 if (!"".equals(txtnit.getText())){
			    cliente.setNit(txtnit.getText());
			    }
    	 if (!"".equals(txtclienten.getText())){
			    cliente.setNombre(txtclienten.getText());
			    }
    	 if (!"".equals(txtapellido.getText())){
			    cliente.setApellido(txtapellido.getText());
			    }
    	 listahotel.buscar(id2).listCliente.agregar(cliente);
    	 txtnit.setText("");
    	 txtclienten.setText("");
    	 txtapellido.setText("");
    	 }else{
    		 JOptionPane.showMessageDialog(null,"Otro cliente ya posse este Nit","Error", JOptionPane.INFORMATION_MESSAGE);
    	 }
     }
     //boton dipinibilidad
     if (e.getSource()==btndisponibilidad) {
    	 Date f1=dateChooser.getDate();
    	 Date f2=dateChooser2.getDate();
    	 int dias= ((int) (f2.getTime() - f1.getTime()))/(1000 * 60 * 60 * 24);
    	 int total=preciot*dias;
    	 String s =""+total;
    	 prueba.setText(s);
     }
     if (e.getSource()==buscarCliente) {
    	 String a=txtnit2.getText();
    	 for (int i=0;i<listahotel.tamano();i++){
    		 if(listahotel.obtener(i).listCliente.buscar(a)!=null){
    	    	 txtclienten2.setText(listahotel.obtener(i).listCliente.buscar(a).getNombre());
    	    	 txtapellido2.setText(listahotel.obtener(i).listCliente.buscar(a).getApellido());
    	    	 x=false;
    	    	 break;
			   }
    		 else{
    			 x=true;
    		 }
    		 }
    	 if(x==true){
    		 JOptionPane.showMessageDialog(null,"Cliente no registrado","Mensaje", JOptionPane.INFORMATION_MESSAGE);
    		 rcliente.setEnabled(true);
    	 }
         
     }
     //registra cliente de reservaciones
     if (e.getSource()==rcliente) {
    	 Cliente cliente = new Cliente();
    	 String nombre=comboBox.getSelectedItem().toString();
    	 if (!"".equals(txtnit2.getText())){
			    cliente.setNit(txtnit2.getText());
			    }
    	 if (!"".equals(txtclienten2.getText())){
			    cliente.setNombre(txtclienten2.getText());
			    }
    	 if (!"".equals(txtapellido2.getText())){
			    cliente.setApellido(txtapellido2.getText());
			    }
    	 listahotel.buscar(nombre).listCliente.agregar(cliente);
    	 JOptionPane.showMessageDialog(null,"usuario registrado","Mensaje", JOptionPane.INFORMATION_MESSAGE);
    	 rcliente.setEnabled(false);
     }
     //agrega reservacion
     if (e.getSource()==btnAgregarReservacion) {
    	 String nombre=comboBox.getSelectedItem().toString();
    	 Date f1=dateChooser.getDate();
    	 Date f2=dateChooser2.getDate();
    	 int dias= ((int) (f2.getTime() - f1.getTime()))/(1000 * 60 * 60 * 24);
    	 int total=preciot*dias;
    	 int vuelto=Integer.parseInt(txtcobro.getText())-total;
    	 try{
    	 if(estadop.equals("Disponible")){
    	 if(Integer.parseInt(txtcobro.getText())>=total){
    	 Reservacion reservacion = new Reservacion();
    	 Habitacion habitacion = new Habitacion();
    	 Cliente cliente = new Cliente();
    	 habitacion.setNumero(i);
    	 habitacion.setEdificio(edificiot);
    	 habitacion.setEstado(estadot);
    	 habitacion.setNivel(nivelt);
    	 habitacion.setNumeroCamas(camast);
    	 habitacion.setPrecio(preciot);
    	 habitacion.setTipo(tipot);
    	 reservacion.setHabitacion(habitacion);
    	 if (!"".equals(txtnit2.getText())){
			    cliente.setNit(txtnit2.getText());
			    }
    	 if (!"".equals(txtclienten2.getText())){
			    cliente.setNombre(txtclienten2.getText());
			    }
    	 if (!"".equals(txtapellido2.getText())){
			    cliente.setApellido(txtapellido2.getText());
			    }
    	 reservacion.setCliente(cliente);
    	 reservacion.setCodigoReserva(c);
    	 reservacion.setFechaEntrada(dateChooser.getDate());
    	 reservacion.setFechaSalida(dateChooser2.getDate());
    	 reservacion.setDiasReserva(dias);
    	 reservacion.setCostoReserva(total);
    	 listahotel.buscar(nombre).listaReservacion.agregar(reservacion);
    	 c++;
    	 listahotel.buscar(nombre).listaHabitacion.buscar(i).setEstado("ocupado");
    	 JOptionPane.showMessageDialog(null,"Se ha reservado con exito,su vuelto es: "+vuelto,"Mensaje", JOptionPane.INFORMATION_MESSAGE);
    	 txtnit2.setText("");
    	 txtapellido2.setText("");
    	 prueba.setText("");
    	 txtcobro.setText("");
    	 txtclienten2.setText("");
    	 txtnombre2.setText("");
    	 
    	 }
    	 else{
           JOptionPane.showMessageDialog(null,"No es suficiente dinero para pagar la reservacion","Mensaje", JOptionPane.INFORMATION_MESSAGE);
    	 }
    	 }else{
    		 JOptionPane.showMessageDialog(null,"Nose puede reservar ya que esta ocupada","Mensaje", JOptionPane.INFORMATION_MESSAGE);
    	 }
       }catch(Exception i){ 
     	JOptionPane.showMessageDialog(null,"no se ha reservado","Error", JOptionPane.INFORMATION_MESSAGE);
	    }
     }
     //ACTUALIza la tabla de reservaciones
     if (e.getSource()==actualizar) {
    	 SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		  int a =md2.getRowCount()-1; 
	         for(int w=a;w>=0;w--){  
	             md2.removeRow(w);
	         }
		String eleccion=hotel3.getSelectedItem().toString();
		for (int i=0;i<listahotel.buscar(eleccion).listaReservacion.tamano();i++){
		Object Datos[]={listahotel.buscar(eleccion).listaReservacion.obtener(i).getCodigoReserva(),formato.format(listahotel.buscar(eleccion).listaReservacion.obtener(i).getFechaEntrada()),
				formato.format(listahotel.buscar(eleccion).listaReservacion.obtener(i).getFechaSalida()),listahotel.buscar(eleccion).listaReservacion.obtener(i).getHabitacion().getNumero(),
				listahotel.buscar(eleccion).listaReservacion.obtener(i).getHabitacion().getTipo(),listahotel.buscar(eleccion).listaReservacion.obtener(i).getCliente().getNombre(),listahotel.buscar(eleccion).listaReservacion.obtener(i).getCostoReserva()};
		md2.addRow(Datos);
		}
		}
     //elimina una reservacion
     if (e.getSource()==eliminar) {
    	 int a =md2.getRowCount()-1;
    	 SimpleDateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
    	 String eleccion=hotel3.getSelectedItem().toString();
         String habitaciontipo;
         habitaciontipo=listahotel.buscar(eleccion).listaReservacion.buscar(i2).getHabitacion().getTipo();
         String fechaone=formato1.format(listahotel.buscar(eleccion).listaReservacion.buscar(i2).getFechaEntrada());
         String fechatwo=formato1.format(listahotel.buscar(eleccion).listaReservacion.buscar(i2).getFechaSalida());
         System.out.println(habitaciontipo);
    	 if (listahotel.buscar(eleccion).listaespera.verificar(fechaone,fechatwo, habitaciontipo)!=null){
    		 listahotel.buscar(eleccion).listaReservacion.buscar(i2).setCliente(listahotel.buscar(eleccion).listaespera.verificar(fechaone,fechatwo, habitaciontipo).getCliente());
    		 JOptionPane.showMessageDialog(null,"Se ha dado la reservacion a cliente en cola :"+ listahotel.buscar(eleccion).listaReservacion.buscar(i2).getCliente().getNombre()+",identificado con nit: "+listahotel.buscar(eleccion).listaReservacion.buscar(i2).getCliente().getNit(),"Mensaje", JOptionPane.INFORMATION_MESSAGE);
    	 }else{
    		 listahotel.buscar(eleccion).listaReservacion.eliminar(i2);
    		 listahotel.buscar(eleccion).listaHabitacion.buscar(h).setEstado("disponible");
    		 md2.removeRow(a);
    		 JOptionPane.showMessageDialog(null,"Se ha eliminado la reservacion","Mensaje", JOptionPane.INFORMATION_MESSAGE);
    	 }
    	 
    	 
     }
     //registro de restarante
     if (e.getSource()==rrestaurante) {
    	 String eleccion=hotel4.getSelectedItem().toString();
    	 Restaurante restaurante = new Restaurante();
    	        if (!"".equals(txtcapacidad.getText())){
    			restaurante.setCapacidad(Integer.parseInt(txtcapacidad.getText()));
    			}
    			if (!"".equals(txtnombrer.getText())){
    			restaurante.setNombre(txtnombrer.getText());
    			}
    			if (!"".equals(txtespecialidad.getText())){
    			restaurante.setEspecialidad(txtespecialidad.getText());
    			}
    			if (!"".equals(txtubicacion.getText())){
    			restaurante.setUbicacion(txtubicacion.getText());
    			}
    			if (!"".equals(txthorario.getText())){
    			restaurante.setHorario(txthorario.getText());
    			}
    	 listahotel.buscar(eleccion).listarestaurante.agregar(restaurante);
    	 txtnombrer.setText("");
    	 txtespecialidad.setText("");
    	 txtcapacidad.setText("");
    	 txtubicacion.setText("");
    	 txthorario.setText("");
    	 restaurantel.removeAllItems();
    	 for (int i=0;i<listahotel.buscar(eleccion).listarestaurante.tamano();i++){
			restaurantel.addItem(listahotel.buscar(eleccion).listarestaurante.obtener(i).getNombre());
			}
     }
     //registra servicio
     if (e.getSource()==rservicio) {
    	 String eleccion=hotel5.getSelectedItem().toString();
    	 Servicio servicio = new Servicio();
    	    if (!"".equals(txtnombre2.getText())){
 		      servicio.setNombre(txtnombre2.getText());
 			}
 			if (!"".equals(txtcapacidad2.getText())){
 			servicio.setCapacidad(Integer.parseInt(txtcapacidad2.getText()));
 			}
 			if (!"".equals(txtdescripcion.getText())){
 		    servicio.setDescripcion(txtdescripcion.getText());
 			}
 			if (!"".equals(txtprecio2.getText())){
 			servicio.setPrecio(Integer.parseInt(txtprecio2.getText()));
 			}
    	 listahotel.buscar(eleccion).listaservicio.agregar(servicio);
    	 txtnombre2.setText("");
    	 txtcapacidad2.setText("");
    	 txtdescripcion.setText("");
    	 txtprecio2.setText("");
     }
     if (e.getSource()==agregarcc) {
    	 int  id2=(int) hotelcliente.getSelectedItem();
    	 if( listahotel.buscar(id2).listCliente.buscarnit(txtnit.getText())==false){
    		 ColaEspera espera = new ColaEspera();
    		 Cliente cliente = new Cliente();
    	 if (!"".equals(txtnit.getText())){
			    cliente.setNit(txtnit.getText());
			    }
    	 if (!"".equals(txtclienten.getText())){
			    cliente.setNombre(txtclienten.getText());
			    }
    	 if (!"".equals(txtapellido.getText())){
			    cliente.setApellido(txtapellido.getText());
			    }
    	 espera.setFechaEntrada(cf1.getDate());
    	 espera.setFechaSalida(cf2.getDate());
    	 espera.setNumero(c1);
    	 espera.setTipohabitacion(estadoc.getSelectedItem().toString());
         espera.setCliente(cliente);
         listahotel.buscar(id2).listaespera.agregar(espera);
    	 c1++;
    	 JOptionPane.showMessageDialog(null,"Se ha registrado cliente en cola exitosamente","Mensaje", JOptionPane.INFORMATION_MESSAGE);
    	 }else{
    		 JOptionPane.showMessageDialog(null,"Otro cliente ya posse este Nit","Error", JOptionPane.INFORMATION_MESSAGE);
    	 }
      }
     //verificar servicios
     if (e.getSource()==verificars) {
    	 String eleccion=hotel7.getSelectedItem().toString();
    	 serviciol.removeAllItems();
    	 for (int i=0;i<listahotel.buscar(eleccion).listaservicio.tamano();i++){
				serviciol.addItem(listahotel.buscar(eleccion).listaservicio.obtener(i).getNombre());
			}
     }
    //verificar pr0mociones
     if (e.getSource()== consultarPromocion) {
    	 
     }
     if (e.getSource()== buscar3) {
    	 String a=txtnit2.getText();
    	 for (int i=0;i<listahotel.tamano();i++){
    		 if(listahotel.obtener(i).listCliente.buscar(a)!=null){
    	    	 txtclienten2.setText(listahotel.obtener(i).listCliente.buscar(a).getNombre());
    	    	 txtapellido2.setText(listahotel.obtener(i).listCliente.buscar(a).getApellido());
    	    	 z=false;
    	    	 break;
			   }
    		 else{
    			 z=true;
    		 }
    		 }
    	 if(z==true){
    		 JOptionPane.showMessageDialog(null,"Cliente no registrado","Mensaje", JOptionPane.INFORMATION_MESSAGE);
    		 rcliente.setEnabled(true);
    	 }
     }
     //agragr servicio
     if (e.getSource()== agregarServ) {
    	 int a =md2.getRowCount()-1; 
         for(int w=a;w>=0;w--){  
             md2.removeRow(w);
         }
	    String eleccion=hotel7.getSelectedItem().toString();
     }
     //registrar pormocion
     if (e.getSource()== rpromocion) {
        Promocion promocion = new Promocion();
   	 if (!"".equals(txtdes.getText())){
			    promocion.setDescripcion(txtdes.getText());
			    }
   	if (!"".equals(txpais.getText())){
	    promocion.setPais(txtpais.getText());
	    }
   	 if (!"".equals(txtpreciop.getText())){
			    promocion.setPrecio(Integer.parseInt(txtpreciop.getText()));
			    }
   	 if (!"".equals(npersonas.getText())){
		    promocion.setPrecio(Integer.parseInt(npersonas.getText()));
		    }
   	 if (!"".equals(dias.getText())){
		    promocion.setPrecio(Integer.parseInt(dias.getText()));
		    }
        listapromocion.agregar(promocion);
        txtdes.setText("");
        txpais.setText("");;
        txtpreciop.setText("");
        npersonas.setText("");
        dias.setText("");
     }
     //buscar pormocion en reservaciones
     if (e.getSource()== buscarpromo) {
    	 String nombre=comboBox.getSelectedItem().toString();
         String actual =listahotel.buscar(nombre).getPais();
         SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
         JOptionPane.showMessageDialog(null,listapromocion.buscar(actual).getDescripcion()+" F inicial: "+formato.format(listapromocion.buscar(actual).getFechaInicio())+" F final: "+formato.format(listapromocion.buscar(actual).getFechaFinal()),"Mensaje", JOptionPane.INFORMATION_MESSAGE);
      }
	}
	
		
	
	public class manVentana implements WindowListener
	{
		public void windowClosing(WindowEvent e)
		{
			PreguntaCerrar();
		}
		public void windowDeactivated(WindowEvent e)
		{
			
		}
		public void windowActivated(WindowEvent e)
		{
			
		}
		public void windowDeiconified(WindowEvent e)
		{
			
		}
		public void windowIconified(WindowEvent e)
		{
			
		}
		public void windowClosed(WindowEvent e)
		{
			
		}
		public void windowOpened(WindowEvent e)
		{
			
		}
	}
	
	public void PreguntaCerrar()
	{
		int Opcion;
			Opcion = JOptionPane.showConfirmDialog(this,"Desea Salir del programa","Mensaje",JOptionPane.YES_NO_OPTION);
			if (Opcion == JOptionPane.YES_OPTION) 
			{
				System.exit(0);
			}				
	}
	
}

