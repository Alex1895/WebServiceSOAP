
package com.hcl.service.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.hcl.service.soap package. 
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

    private final static QName _SumResponse_QNAME = new QName("http://soap.service.hcl.com/", "sumResponse");
    private final static QName _Fibo_QNAME = new QName("http://soap.service.hcl.com/", "fibo");
    private final static QName _Sum_QNAME = new QName("http://soap.service.hcl.com/", "sum");
    private final static QName _Mul_QNAME = new QName("http://soap.service.hcl.com/", "mul");
    private final static QName _MulResponse_QNAME = new QName("http://soap.service.hcl.com/", "mulResponse");
    private final static QName _FiboResponse_QNAME = new QName("http://soap.service.hcl.com/", "fiboResponse");
    private final static QName _Res_QNAME = new QName("http://soap.service.hcl.com/", "res");
    private final static QName _ResResponse_QNAME = new QName("http://soap.service.hcl.com/", "resResponse");
    private final static QName _Div_QNAME = new QName("http://soap.service.hcl.com/", "div");
    private final static QName _DivResponse_QNAME = new QName("http://soap.service.hcl.com/", "divResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.hcl.service.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Div }
     * 
     */
    public Div createDiv() {
        return new Div();
    }

    /**
     * Create an instance of {@link FiboResponse }
     * 
     */
    public FiboResponse createFiboResponse() {
        return new FiboResponse();
    }

    /**
     * Create an instance of {@link Res }
     * 
     */
    public Res createRes() {
        return new Res();
    }

    /**
     * Create an instance of {@link ResResponse }
     * 
     */
    public ResResponse createResResponse() {
        return new ResResponse();
    }

    /**
     * Create an instance of {@link DivResponse }
     * 
     */
    public DivResponse createDivResponse() {
        return new DivResponse();
    }

    /**
     * Create an instance of {@link MulResponse }
     * 
     */
    public MulResponse createMulResponse() {
        return new MulResponse();
    }

    /**
     * Create an instance of {@link Mul }
     * 
     */
    public Mul createMul() {
        return new Mul();
    }

    /**
     * Create an instance of {@link Sum }
     * 
     */
    public Sum createSum() {
        return new Sum();
    }

    /**
     * Create an instance of {@link SumResponse }
     * 
     */
    public SumResponse createSumResponse() {
        return new SumResponse();
    }

    /**
     * Create an instance of {@link Fibo }
     * 
     */
    public Fibo createFibo() {
        return new Fibo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.service.hcl.com/", name = "sumResponse")
    public JAXBElement<SumResponse> createSumResponse(SumResponse value) {
        return new JAXBElement<SumResponse>(_SumResponse_QNAME, SumResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Fibo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.service.hcl.com/", name = "fibo")
    public JAXBElement<Fibo> createFibo(Fibo value) {
        return new JAXBElement<Fibo>(_Fibo_QNAME, Fibo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.service.hcl.com/", name = "sum")
    public JAXBElement<Sum> createSum(Sum value) {
        return new JAXBElement<Sum>(_Sum_QNAME, Sum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Mul }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.service.hcl.com/", name = "mul")
    public JAXBElement<Mul> createMul(Mul value) {
        return new JAXBElement<Mul>(_Mul_QNAME, Mul.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MulResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.service.hcl.com/", name = "mulResponse")
    public JAXBElement<MulResponse> createMulResponse(MulResponse value) {
        return new JAXBElement<MulResponse>(_MulResponse_QNAME, MulResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FiboResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.service.hcl.com/", name = "fiboResponse")
    public JAXBElement<FiboResponse> createFiboResponse(FiboResponse value) {
        return new JAXBElement<FiboResponse>(_FiboResponse_QNAME, FiboResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Res }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.service.hcl.com/", name = "res")
    public JAXBElement<Res> createRes(Res value) {
        return new JAXBElement<Res>(_Res_QNAME, Res.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.service.hcl.com/", name = "resResponse")
    public JAXBElement<ResResponse> createResResponse(ResResponse value) {
        return new JAXBElement<ResResponse>(_ResResponse_QNAME, ResResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Div }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.service.hcl.com/", name = "div")
    public JAXBElement<Div> createDiv(Div value) {
        return new JAXBElement<Div>(_Div_QNAME, Div.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.service.hcl.com/", name = "divResponse")
    public JAXBElement<DivResponse> createDivResponse(DivResponse value) {
        return new JAXBElement<DivResponse>(_DivResponse_QNAME, DivResponse.class, null, value);
    }

}
