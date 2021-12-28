<script>
import CrearFactura from '../components/Project/Facturacion/Factura/CrearFactura.vue'
import EditarFactura from "../components/Project/Facturacion/Factura/EditarFactura";
import Login from "../components/Project/Login";

const routes = [
	{ path: '/', redirect: '/crearFactura' },
    { path: '/login', component: Login },
    { path: '/crearFactura', component: CrearFactura },
    { path: '/editarFactura', component: EditarFactura }

]

export default routes;
</script>
