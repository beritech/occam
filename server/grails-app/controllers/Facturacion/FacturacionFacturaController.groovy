package Facturacion

import grails.plugin.springsecurity.annotation.Secured
import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.CREATED
import static org.springframework.http.HttpStatus.NOT_FOUND
import static org.springframework.http.HttpStatus.NO_CONTENT
import static org.springframework.http.HttpStatus.OK
import static org.springframework.http.HttpStatus.UNPROCESSABLE_ENTITY

import grails.gorm.transactions.ReadOnly
import grails.gorm.transactions.Transactional

//@ReadOnly
//@Secured('isAuthenticated')
class FacturacionFacturaController {

    FacturacionFacturaService facturacionFacturaService

    static responseFormats = ['json', 'xml']
    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond facturacionFacturaService.list(params), model:[facturacionFacturaCount: facturacionFacturaService.count()]
    }

    def show(Long id) {
        respond facturacionFacturaService.get(id)
    }

    @Transactional
    def save(FacturacionFactura facturacionFactura) {
        if (facturacionFactura == null) {
            render status: NOT_FOUND
            return
        }
        if (facturacionFactura.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond facturacionFactura.errors
            return
        }

        try {
            facturacionFacturaService.save(facturacionFactura)
        } catch (ValidationException e) {
            respond facturacionFactura.errors
            return
        }

        respond facturacionFactura, [status: CREATED, view:"show"]
    }

    @Transactional
    def update(FacturacionFactura facturacionFactura) {
        if (facturacionFactura == null) {
            render status: NOT_FOUND
            return
        }
        if (facturacionFactura.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond facturacionFactura.errors
            return
        }

        try {
            facturacionFacturaService.save(facturacionFactura)
        } catch (ValidationException e) {
            respond facturacionFactura.errors
            return
        }

        respond facturacionFactura, [status: OK, view:"show"]
    }

    @Transactional
    def delete(Long id) {
        if (id == null || facturacionFacturaService.delete(id) == null) {
            render status: NOT_FOUND
            return
        }

        render status: NO_CONTENT
    }
}
