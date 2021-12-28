<template id="fulltable-template" xmlns="http://www.w3.org/1999/xhtml">
    <table class="table">
        <thead class="thead-inverse">
        <tr>
            <th>ID</th>
            <th>Nombre</th>
        </tr>
        </thead>
        <table-row v-for="factura in facturas"
                   :item="factura" :key="factura.id"></table-row>
    </table>
</template>

<script>
    import TableRow from "../TableRow";

    export default {
        props: ['facturas'],
        components: {
            TableRow
        }
    }
</script>

<style>
    /* Add custom rules here */
</style>