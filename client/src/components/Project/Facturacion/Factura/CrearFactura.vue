<template>
    <div>
        <!-- BEGIN breadcrumb -->
        <ol class="breadcrumb float-xl-end">
            <li class="breadcrumb-item"><a href="javascript:;">Home</a></li>
            <li class="breadcrumb-item"><a href="javascript:;">Form Stuff</a></li>
            <li class="breadcrumb-item active">Form Plugins</li>
        </ol>
        <!-- END breadcrumb -->
        <!-- BEGIN page-header -->
        <h1 class="page-header">Factura <small>Crear</small></h1>
        <!-- END page-header -->
        <div class="panel-body">
            <!-- BEGIN row -->
            <div class="row">
                <!-- BEGIN-->
                <div class="col-xl-12">
                    <!-- BEGIN panel -->
                    <panel title="Crear" bodyClass="p-4">
                        <formulario action="Crear" v-model="factura" @submit="submitNewFactura()"></formulario>
                    </panel>
                    <tabla-factura :facturas="facturas"></tabla-factura>
                    <!-- END panel -->
                </div>
                <!-- END -->
            </div>
            <!-- END row -->
        </div>
    </div>
</template>
<script>
    import Formulario from "./Formulario";
    import TablaFactura from "./TablaFactura";
    // import TablaFactura from "./TablaFactura";
    export default {
        name: 'CrearFactura',
        data: function () {
            return {
                serverURL: process.env.SERVER_URL,
                factura: { nombre: '' },
                facturas: []
            }
        },
        components: {
            TablaFactura,
            Formulario
            // TablaFactura
        },
        created () {
            this.fetchData()
        },
        methods: {
            fetchData: async function () {
                try {
                    await Promise.all([
                        this.fetchFacturas()
                    ])
                } catch (error) {
                    console.log(error)
                }
            },
            fetchFacturas: function () {
                fetch(`http://localhost:8080/facturacionFactura`)
                    .then(r => r.json())
                    .then(json => { this.facturas = json })
                    .catch(error => console.error('Error retrieving vehicles: ' + error))
            },
            submitNewFactura () {
                const factura = this.factura
                console.log(factura);
                fetch(`http://localhost:8080/facturacionFactura`, {
                    method: 'POST',
                    headers: {'Content-Type': 'application/json'},
                    body: JSON.stringify(factura)
                }).then(r => r.json())
                    .then(json => {
                        // this.factura.push(json)
                        console.log(json)
                        this.factura = { nombre: '' }
                        this.fetchData()
                    }).catch(ex => console.error('error', ex))
            }
        }
    }

</script>
