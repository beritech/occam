<template id="tablerow-template" xmlns="http://www.w3.org/1999/xhtml">
    <tr> <!-- 1 -->
        <td>{{ item.id }}</td>
        <td>{{ item.nombre }}</td>
    </tr>
</template>

<script>
    export default {
        props: ['item']
    }
</script>

<style scoped>

</style>