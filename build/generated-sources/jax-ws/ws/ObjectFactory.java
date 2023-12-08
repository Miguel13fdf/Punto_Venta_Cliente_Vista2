
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BuscarGrupoClasificacionPorID_QNAME = new QName("http://ws/", "buscarGrupoClasificacionPorID");
    private final static QName _BuscarGrupoClasificacionPorIDResponse_QNAME = new QName("http://ws/", "buscarGrupoClasificacionPorIDResponse");
    private final static QName _BuscarP_QNAME = new QName("http://ws/", "buscarP");
    private final static QName _BuscarPResponse_QNAME = new QName("http://ws/", "buscarPResponse");
    private final static QName _BuscarProductoPorId_QNAME = new QName("http://ws/", "buscarProductoPorId");
    private final static QName _BuscarProductoPorIdResponse_QNAME = new QName("http://ws/", "buscarProductoPorIdResponse");
    private final static QName _BuscarRUCProveedorPorID_QNAME = new QName("http://ws/", "buscarRUCProveedorPorID");
    private final static QName _BuscarRUCProveedorPorIDResponse_QNAME = new QName("http://ws/", "buscarRUCProveedorPorIDResponse");
    private final static QName _BuscarRuc_QNAME = new QName("http://ws/", "buscarRuc");
    private final static QName _BuscarRucResponse_QNAME = new QName("http://ws/", "buscarRucResponse");
    private final static QName _CrearProducto_QNAME = new QName("http://ws/", "crearProducto");
    private final static QName _CrearProductoResponse_QNAME = new QName("http://ws/", "crearProductoResponse");
    private final static QName _Hello_QNAME = new QName("http://ws/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://ws/", "helloResponse");
    private final static QName _ListarPersonas_QNAME = new QName("http://ws/", "listarPersonas");
    private final static QName _ListarPersonasResponse_QNAME = new QName("http://ws/", "listarPersonasResponse");
    private final static QName _ListarUsuarios_QNAME = new QName("http://ws/", "listarUsuarios");
    private final static QName _ListarUsuariosResponse_QNAME = new QName("http://ws/", "listarUsuariosResponse");
    private final static QName _Listarroles_QNAME = new QName("http://ws/", "listarroles");
    private final static QName _ListarrolesResponse_QNAME = new QName("http://ws/", "listarrolesResponse");
    private final static QName _LoginUsuario_QNAME = new QName("http://ws/", "loginUsuario");
    private final static QName _LoginUsuarioResponse_QNAME = new QName("http://ws/", "loginUsuarioResponse");
    private final static QName _Persona_QNAME = new QName("http://ws/", "persona");
    private final static QName _RegistrarCompetenciaRol_QNAME = new QName("http://ws/", "registrarCompetenciaRol");
    private final static QName _RegistrarCompetenciaRolResponse_QNAME = new QName("http://ws/", "registrarCompetenciaRolResponse");
    private final static QName _RegistrarFacturaConItems_QNAME = new QName("http://ws/", "registrarFacturaConItems");
    private final static QName _RegistrarFacturaConItemsResponse_QNAME = new QName("http://ws/", "registrarFacturaConItemsResponse");
    private final static QName _RegistrarProveedorYClasificacion_QNAME = new QName("http://ws/", "registrarProveedorYClasificacion");
    private final static QName _RegistrarProveedorYClasificacionResponse_QNAME = new QName("http://ws/", "registrarProveedorYClasificacionResponse");
    private final static QName _RegistrarTipoPago_QNAME = new QName("http://ws/", "registrarTipoPago");
    private final static QName _RegistrarTipoPagoResponse_QNAME = new QName("http://ws/", "registrarTipoPagoResponse");
    private final static QName _RegistrarUsuarioPersonaRol_QNAME = new QName("http://ws/", "registrarUsuarioPersonaRol");
    private final static QName _RegistrarUsuarioPersonaRolResponse_QNAME = new QName("http://ws/", "registrarUsuarioPersonaRolResponse");
    private final static QName _Registrarrol_QNAME = new QName("http://ws/", "registrarrol");
    private final static QName _RegistrarrolResponse_QNAME = new QName("http://ws/", "registrarrolResponse");
    private final static QName _SiexisteComp_QNAME = new QName("http://ws/", "siexisteComp");
    private final static QName _SiexisteCompResponse_QNAME = new QName("http://ws/", "siexisteCompResponse");
    private final static QName _Siexisterol_QNAME = new QName("http://ws/", "siexisterol");
    private final static QName _SiexisterolResponse_QNAME = new QName("http://ws/", "siexisterolResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarGrupoClasificacionPorID }
     * 
     */
    public BuscarGrupoClasificacionPorID createBuscarGrupoClasificacionPorID() {
        return new BuscarGrupoClasificacionPorID();
    }

    /**
     * Create an instance of {@link BuscarGrupoClasificacionPorIDResponse }
     * 
     */
    public BuscarGrupoClasificacionPorIDResponse createBuscarGrupoClasificacionPorIDResponse() {
        return new BuscarGrupoClasificacionPorIDResponse();
    }

    /**
     * Create an instance of {@link BuscarP }
     * 
     */
    public BuscarP createBuscarP() {
        return new BuscarP();
    }

    /**
     * Create an instance of {@link BuscarPResponse }
     * 
     */
    public BuscarPResponse createBuscarPResponse() {
        return new BuscarPResponse();
    }

    /**
     * Create an instance of {@link BuscarProductoPorId }
     * 
     */
    public BuscarProductoPorId createBuscarProductoPorId() {
        return new BuscarProductoPorId();
    }

    /**
     * Create an instance of {@link BuscarProductoPorIdResponse }
     * 
     */
    public BuscarProductoPorIdResponse createBuscarProductoPorIdResponse() {
        return new BuscarProductoPorIdResponse();
    }

    /**
     * Create an instance of {@link BuscarRUCProveedorPorID }
     * 
     */
    public BuscarRUCProveedorPorID createBuscarRUCProveedorPorID() {
        return new BuscarRUCProveedorPorID();
    }

    /**
     * Create an instance of {@link BuscarRUCProveedorPorIDResponse }
     * 
     */
    public BuscarRUCProveedorPorIDResponse createBuscarRUCProveedorPorIDResponse() {
        return new BuscarRUCProveedorPorIDResponse();
    }

    /**
     * Create an instance of {@link BuscarRuc }
     * 
     */
    public BuscarRuc createBuscarRuc() {
        return new BuscarRuc();
    }

    /**
     * Create an instance of {@link BuscarRucResponse }
     * 
     */
    public BuscarRucResponse createBuscarRucResponse() {
        return new BuscarRucResponse();
    }

    /**
     * Create an instance of {@link CrearProducto }
     * 
     */
    public CrearProducto createCrearProducto() {
        return new CrearProducto();
    }

    /**
     * Create an instance of {@link CrearProductoResponse }
     * 
     */
    public CrearProductoResponse createCrearProductoResponse() {
        return new CrearProductoResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link ListarPersonas }
     * 
     */
    public ListarPersonas createListarPersonas() {
        return new ListarPersonas();
    }

    /**
     * Create an instance of {@link ListarPersonasResponse }
     * 
     */
    public ListarPersonasResponse createListarPersonasResponse() {
        return new ListarPersonasResponse();
    }

    /**
     * Create an instance of {@link ListarUsuarios }
     * 
     */
    public ListarUsuarios createListarUsuarios() {
        return new ListarUsuarios();
    }

    /**
     * Create an instance of {@link ListarUsuariosResponse }
     * 
     */
    public ListarUsuariosResponse createListarUsuariosResponse() {
        return new ListarUsuariosResponse();
    }

    /**
     * Create an instance of {@link Listarroles }
     * 
     */
    public Listarroles createListarroles() {
        return new Listarroles();
    }

    /**
     * Create an instance of {@link ListarrolesResponse }
     * 
     */
    public ListarrolesResponse createListarrolesResponse() {
        return new ListarrolesResponse();
    }

    /**
     * Create an instance of {@link LoginUsuario }
     * 
     */
    public LoginUsuario createLoginUsuario() {
        return new LoginUsuario();
    }

    /**
     * Create an instance of {@link LoginUsuarioResponse }
     * 
     */
    public LoginUsuarioResponse createLoginUsuarioResponse() {
        return new LoginUsuarioResponse();
    }

    /**
     * Create an instance of {@link Persona }
     * 
     */
    public Persona createPersona() {
        return new Persona();
    }

    /**
     * Create an instance of {@link RegistrarCompetenciaRol }
     * 
     */
    public RegistrarCompetenciaRol createRegistrarCompetenciaRol() {
        return new RegistrarCompetenciaRol();
    }

    /**
     * Create an instance of {@link RegistrarCompetenciaRolResponse }
     * 
     */
    public RegistrarCompetenciaRolResponse createRegistrarCompetenciaRolResponse() {
        return new RegistrarCompetenciaRolResponse();
    }

    /**
     * Create an instance of {@link RegistrarFacturaConItems }
     * 
     */
    public RegistrarFacturaConItems createRegistrarFacturaConItems() {
        return new RegistrarFacturaConItems();
    }

    /**
     * Create an instance of {@link RegistrarFacturaConItemsResponse }
     * 
     */
    public RegistrarFacturaConItemsResponse createRegistrarFacturaConItemsResponse() {
        return new RegistrarFacturaConItemsResponse();
    }

    /**
     * Create an instance of {@link RegistrarProveedorYClasificacion }
     * 
     */
    public RegistrarProveedorYClasificacion createRegistrarProveedorYClasificacion() {
        return new RegistrarProveedorYClasificacion();
    }

    /**
     * Create an instance of {@link RegistrarProveedorYClasificacionResponse }
     * 
     */
    public RegistrarProveedorYClasificacionResponse createRegistrarProveedorYClasificacionResponse() {
        return new RegistrarProveedorYClasificacionResponse();
    }

    /**
     * Create an instance of {@link RegistrarTipoPago }
     * 
     */
    public RegistrarTipoPago createRegistrarTipoPago() {
        return new RegistrarTipoPago();
    }

    /**
     * Create an instance of {@link RegistrarTipoPagoResponse }
     * 
     */
    public RegistrarTipoPagoResponse createRegistrarTipoPagoResponse() {
        return new RegistrarTipoPagoResponse();
    }

    /**
     * Create an instance of {@link RegistrarUsuarioPersonaRol }
     * 
     */
    public RegistrarUsuarioPersonaRol createRegistrarUsuarioPersonaRol() {
        return new RegistrarUsuarioPersonaRol();
    }

    /**
     * Create an instance of {@link RegistrarUsuarioPersonaRolResponse }
     * 
     */
    public RegistrarUsuarioPersonaRolResponse createRegistrarUsuarioPersonaRolResponse() {
        return new RegistrarUsuarioPersonaRolResponse();
    }

    /**
     * Create an instance of {@link Registrarrol }
     * 
     */
    public Registrarrol createRegistrarrol() {
        return new Registrarrol();
    }

    /**
     * Create an instance of {@link RegistrarrolResponse }
     * 
     */
    public RegistrarrolResponse createRegistrarrolResponse() {
        return new RegistrarrolResponse();
    }

    /**
     * Create an instance of {@link SiexisteComp }
     * 
     */
    public SiexisteComp createSiexisteComp() {
        return new SiexisteComp();
    }

    /**
     * Create an instance of {@link SiexisteCompResponse }
     * 
     */
    public SiexisteCompResponse createSiexisteCompResponse() {
        return new SiexisteCompResponse();
    }

    /**
     * Create an instance of {@link Siexisterol }
     * 
     */
    public Siexisterol createSiexisterol() {
        return new Siexisterol();
    }

    /**
     * Create an instance of {@link SiexisterolResponse }
     * 
     */
    public SiexisterolResponse createSiexisterolResponse() {
        return new SiexisterolResponse();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link TipoPago }
     * 
     */
    public TipoPago createTipoPago() {
        return new TipoPago();
    }

    /**
     * Create an instance of {@link Clasificacion }
     * 
     */
    public Clasificacion createClasificacion() {
        return new Clasificacion();
    }

    /**
     * Create an instance of {@link Proveedores }
     * 
     */
    public Proveedores createProveedores() {
        return new Proveedores();
    }

    /**
     * Create an instance of {@link Rol }
     * 
     */
    public Rol createRol() {
        return new Rol();
    }

    /**
     * Create an instance of {@link Producto }
     * 
     */
    public Producto createProducto() {
        return new Producto();
    }

    /**
     * Create an instance of {@link ItemFactura }
     * 
     */
    public ItemFactura createItemFactura() {
        return new ItemFactura();
    }

    /**
     * Create an instance of {@link Factura }
     * 
     */
    public Factura createFactura() {
        return new Factura();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarGrupoClasificacionPorID }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarGrupoClasificacionPorID }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "buscarGrupoClasificacionPorID")
    public JAXBElement<BuscarGrupoClasificacionPorID> createBuscarGrupoClasificacionPorID(BuscarGrupoClasificacionPorID value) {
        return new JAXBElement<BuscarGrupoClasificacionPorID>(_BuscarGrupoClasificacionPorID_QNAME, BuscarGrupoClasificacionPorID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarGrupoClasificacionPorIDResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarGrupoClasificacionPorIDResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "buscarGrupoClasificacionPorIDResponse")
    public JAXBElement<BuscarGrupoClasificacionPorIDResponse> createBuscarGrupoClasificacionPorIDResponse(BuscarGrupoClasificacionPorIDResponse value) {
        return new JAXBElement<BuscarGrupoClasificacionPorIDResponse>(_BuscarGrupoClasificacionPorIDResponse_QNAME, BuscarGrupoClasificacionPorIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarP }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarP }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "buscarP")
    public JAXBElement<BuscarP> createBuscarP(BuscarP value) {
        return new JAXBElement<BuscarP>(_BuscarP_QNAME, BuscarP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarPResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarPResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "buscarPResponse")
    public JAXBElement<BuscarPResponse> createBuscarPResponse(BuscarPResponse value) {
        return new JAXBElement<BuscarPResponse>(_BuscarPResponse_QNAME, BuscarPResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarProductoPorId }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarProductoPorId }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "buscarProductoPorId")
    public JAXBElement<BuscarProductoPorId> createBuscarProductoPorId(BuscarProductoPorId value) {
        return new JAXBElement<BuscarProductoPorId>(_BuscarProductoPorId_QNAME, BuscarProductoPorId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarProductoPorIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarProductoPorIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "buscarProductoPorIdResponse")
    public JAXBElement<BuscarProductoPorIdResponse> createBuscarProductoPorIdResponse(BuscarProductoPorIdResponse value) {
        return new JAXBElement<BuscarProductoPorIdResponse>(_BuscarProductoPorIdResponse_QNAME, BuscarProductoPorIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarRUCProveedorPorID }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarRUCProveedorPorID }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "buscarRUCProveedorPorID")
    public JAXBElement<BuscarRUCProveedorPorID> createBuscarRUCProveedorPorID(BuscarRUCProveedorPorID value) {
        return new JAXBElement<BuscarRUCProveedorPorID>(_BuscarRUCProveedorPorID_QNAME, BuscarRUCProveedorPorID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarRUCProveedorPorIDResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarRUCProveedorPorIDResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "buscarRUCProveedorPorIDResponse")
    public JAXBElement<BuscarRUCProveedorPorIDResponse> createBuscarRUCProveedorPorIDResponse(BuscarRUCProveedorPorIDResponse value) {
        return new JAXBElement<BuscarRUCProveedorPorIDResponse>(_BuscarRUCProveedorPorIDResponse_QNAME, BuscarRUCProveedorPorIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarRuc }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarRuc }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "buscarRuc")
    public JAXBElement<BuscarRuc> createBuscarRuc(BuscarRuc value) {
        return new JAXBElement<BuscarRuc>(_BuscarRuc_QNAME, BuscarRuc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarRucResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarRucResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "buscarRucResponse")
    public JAXBElement<BuscarRucResponse> createBuscarRucResponse(BuscarRucResponse value) {
        return new JAXBElement<BuscarRucResponse>(_BuscarRucResponse_QNAME, BuscarRucResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearProducto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearProducto }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "crearProducto")
    public JAXBElement<CrearProducto> createCrearProducto(CrearProducto value) {
        return new JAXBElement<CrearProducto>(_CrearProducto_QNAME, CrearProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearProductoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearProductoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "crearProductoResponse")
    public JAXBElement<CrearProductoResponse> createCrearProductoResponse(CrearProductoResponse value) {
        return new JAXBElement<CrearProductoResponse>(_CrearProductoResponse_QNAME, CrearProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarPersonas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarPersonas }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listarPersonas")
    public JAXBElement<ListarPersonas> createListarPersonas(ListarPersonas value) {
        return new JAXBElement<ListarPersonas>(_ListarPersonas_QNAME, ListarPersonas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarPersonasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarPersonasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listarPersonasResponse")
    public JAXBElement<ListarPersonasResponse> createListarPersonasResponse(ListarPersonasResponse value) {
        return new JAXBElement<ListarPersonasResponse>(_ListarPersonasResponse_QNAME, ListarPersonasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarUsuarios }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarUsuarios }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listarUsuarios")
    public JAXBElement<ListarUsuarios> createListarUsuarios(ListarUsuarios value) {
        return new JAXBElement<ListarUsuarios>(_ListarUsuarios_QNAME, ListarUsuarios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarUsuariosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarUsuariosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listarUsuariosResponse")
    public JAXBElement<ListarUsuariosResponse> createListarUsuariosResponse(ListarUsuariosResponse value) {
        return new JAXBElement<ListarUsuariosResponse>(_ListarUsuariosResponse_QNAME, ListarUsuariosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Listarroles }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Listarroles }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listarroles")
    public JAXBElement<Listarroles> createListarroles(Listarroles value) {
        return new JAXBElement<Listarroles>(_Listarroles_QNAME, Listarroles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarrolesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarrolesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listarrolesResponse")
    public JAXBElement<ListarrolesResponse> createListarrolesResponse(ListarrolesResponse value) {
        return new JAXBElement<ListarrolesResponse>(_ListarrolesResponse_QNAME, ListarrolesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginUsuario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoginUsuario }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "loginUsuario")
    public JAXBElement<LoginUsuario> createLoginUsuario(LoginUsuario value) {
        return new JAXBElement<LoginUsuario>(_LoginUsuario_QNAME, LoginUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginUsuarioResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoginUsuarioResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "loginUsuarioResponse")
    public JAXBElement<LoginUsuarioResponse> createLoginUsuarioResponse(LoginUsuarioResponse value) {
        return new JAXBElement<LoginUsuarioResponse>(_LoginUsuarioResponse_QNAME, LoginUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Persona }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Persona }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "persona")
    public JAXBElement<Persona> createPersona(Persona value) {
        return new JAXBElement<Persona>(_Persona_QNAME, Persona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarCompetenciaRol }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistrarCompetenciaRol }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "registrarCompetenciaRol")
    public JAXBElement<RegistrarCompetenciaRol> createRegistrarCompetenciaRol(RegistrarCompetenciaRol value) {
        return new JAXBElement<RegistrarCompetenciaRol>(_RegistrarCompetenciaRol_QNAME, RegistrarCompetenciaRol.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarCompetenciaRolResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistrarCompetenciaRolResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "registrarCompetenciaRolResponse")
    public JAXBElement<RegistrarCompetenciaRolResponse> createRegistrarCompetenciaRolResponse(RegistrarCompetenciaRolResponse value) {
        return new JAXBElement<RegistrarCompetenciaRolResponse>(_RegistrarCompetenciaRolResponse_QNAME, RegistrarCompetenciaRolResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarFacturaConItems }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistrarFacturaConItems }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "registrarFacturaConItems")
    public JAXBElement<RegistrarFacturaConItems> createRegistrarFacturaConItems(RegistrarFacturaConItems value) {
        return new JAXBElement<RegistrarFacturaConItems>(_RegistrarFacturaConItems_QNAME, RegistrarFacturaConItems.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarFacturaConItemsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistrarFacturaConItemsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "registrarFacturaConItemsResponse")
    public JAXBElement<RegistrarFacturaConItemsResponse> createRegistrarFacturaConItemsResponse(RegistrarFacturaConItemsResponse value) {
        return new JAXBElement<RegistrarFacturaConItemsResponse>(_RegistrarFacturaConItemsResponse_QNAME, RegistrarFacturaConItemsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarProveedorYClasificacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistrarProveedorYClasificacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "registrarProveedorYClasificacion")
    public JAXBElement<RegistrarProveedorYClasificacion> createRegistrarProveedorYClasificacion(RegistrarProveedorYClasificacion value) {
        return new JAXBElement<RegistrarProveedorYClasificacion>(_RegistrarProveedorYClasificacion_QNAME, RegistrarProveedorYClasificacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarProveedorYClasificacionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistrarProveedorYClasificacionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "registrarProveedorYClasificacionResponse")
    public JAXBElement<RegistrarProveedorYClasificacionResponse> createRegistrarProveedorYClasificacionResponse(RegistrarProveedorYClasificacionResponse value) {
        return new JAXBElement<RegistrarProveedorYClasificacionResponse>(_RegistrarProveedorYClasificacionResponse_QNAME, RegistrarProveedorYClasificacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarTipoPago }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistrarTipoPago }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "registrarTipoPago")
    public JAXBElement<RegistrarTipoPago> createRegistrarTipoPago(RegistrarTipoPago value) {
        return new JAXBElement<RegistrarTipoPago>(_RegistrarTipoPago_QNAME, RegistrarTipoPago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarTipoPagoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistrarTipoPagoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "registrarTipoPagoResponse")
    public JAXBElement<RegistrarTipoPagoResponse> createRegistrarTipoPagoResponse(RegistrarTipoPagoResponse value) {
        return new JAXBElement<RegistrarTipoPagoResponse>(_RegistrarTipoPagoResponse_QNAME, RegistrarTipoPagoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarUsuarioPersonaRol }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistrarUsuarioPersonaRol }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "registrarUsuarioPersonaRol")
    public JAXBElement<RegistrarUsuarioPersonaRol> createRegistrarUsuarioPersonaRol(RegistrarUsuarioPersonaRol value) {
        return new JAXBElement<RegistrarUsuarioPersonaRol>(_RegistrarUsuarioPersonaRol_QNAME, RegistrarUsuarioPersonaRol.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarUsuarioPersonaRolResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistrarUsuarioPersonaRolResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "registrarUsuarioPersonaRolResponse")
    public JAXBElement<RegistrarUsuarioPersonaRolResponse> createRegistrarUsuarioPersonaRolResponse(RegistrarUsuarioPersonaRolResponse value) {
        return new JAXBElement<RegistrarUsuarioPersonaRolResponse>(_RegistrarUsuarioPersonaRolResponse_QNAME, RegistrarUsuarioPersonaRolResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Registrarrol }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Registrarrol }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "registrarrol")
    public JAXBElement<Registrarrol> createRegistrarrol(Registrarrol value) {
        return new JAXBElement<Registrarrol>(_Registrarrol_QNAME, Registrarrol.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarrolResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistrarrolResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "registrarrolResponse")
    public JAXBElement<RegistrarrolResponse> createRegistrarrolResponse(RegistrarrolResponse value) {
        return new JAXBElement<RegistrarrolResponse>(_RegistrarrolResponse_QNAME, RegistrarrolResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SiexisteComp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SiexisteComp }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "siexisteComp")
    public JAXBElement<SiexisteComp> createSiexisteComp(SiexisteComp value) {
        return new JAXBElement<SiexisteComp>(_SiexisteComp_QNAME, SiexisteComp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SiexisteCompResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SiexisteCompResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "siexisteCompResponse")
    public JAXBElement<SiexisteCompResponse> createSiexisteCompResponse(SiexisteCompResponse value) {
        return new JAXBElement<SiexisteCompResponse>(_SiexisteCompResponse_QNAME, SiexisteCompResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Siexisterol }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Siexisterol }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "siexisterol")
    public JAXBElement<Siexisterol> createSiexisterol(Siexisterol value) {
        return new JAXBElement<Siexisterol>(_Siexisterol_QNAME, Siexisterol.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SiexisterolResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SiexisterolResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "siexisterolResponse")
    public JAXBElement<SiexisterolResponse> createSiexisterolResponse(SiexisterolResponse value) {
        return new JAXBElement<SiexisterolResponse>(_SiexisterolResponse_QNAME, SiexisterolResponse.class, null, value);
    }

}
