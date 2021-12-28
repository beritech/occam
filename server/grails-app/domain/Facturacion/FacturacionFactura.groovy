package Facturacion

import grails.rest.Resource

@Resource(uri = '/facturacionFactura')
class FacturacionFactura {

    String nombre

    static constraints = {
        nombre  nullable: true
    }
}
