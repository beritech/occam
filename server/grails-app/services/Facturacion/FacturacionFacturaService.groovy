package Facturacion

import grails.gorm.services.Service

@Service(FacturacionFactura)
interface FacturacionFacturaService {

    FacturacionFactura get(Serializable id)

    List<FacturacionFactura> list(Map args)

    Long count()

    FacturacionFactura delete(Serializable id)

    FacturacionFactura save(FacturacionFactura facturacionFactura)

}
