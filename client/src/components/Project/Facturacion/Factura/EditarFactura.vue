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
        <h1 class="page-header">Factura <small>Editar</small></h1>
        <!-- END page-header -->
        <div class="panel-body">
            <!-- BEGIN row -->
            <div class="row">
                <!-- BEGIN-->
                <div class="col-xl-12">
                    <!-- BEGIN panel -->
                    <panel title="Editar" bodyClass="p-4">
                        <Formulario action="Editar"></Formulario>
                    </panel>
                    <!-- END panel -->
                </div>
                <!-- END -->
            </div>
            <!-- END row -->
        </div>
        <!--        <Formulario action="Crear"></Formulario>-->
    </div>
</template>
<script>
    import Formulario from "./Formulario";
    export default {
        name: 'CrearFactura',
        components: {
            Formulario
        }
    }
</script>
