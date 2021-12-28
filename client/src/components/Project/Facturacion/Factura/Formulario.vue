<template xmlns="http://www.w3.org/1999/xhtml">
    <div>

<!--        <form class="form-horizontal form-bordered">-->

            <div class="row mb-15px">
                <label class="form-label col-form-label col-md-3">Nombre</label>
                <div class="col-md-9">
                    <input type="text" class="form-control mb-5px" name="nombre" placeholder="Ingresa nombre"  v-model="factura.nombre"/>
                </div>
            </div>
            <button type="submit" class="btn btn-primary w-100px me-5px" @click="submit()" >Guardar</button>
            <button type="submit" class="btn btn-default w-100px">Limpiar</button>

<!--        </form>-->

    </div>
</template>

<script>
    export default {
        name: "Formulario",
        props:['factura', 'accion'],
        model: {
            prop: 'factura',
            event: 'change'
        },
        methods: {
            submit () {
                this.$emit('submit')
            }
        }
    }
</script>
