<script>
    const sidebarMenu = [
        { path: '/crearFactura', icon: 'fa fa-landmark', title: 'Facturación',
            children: [
                { path: '/crearFactura', title: 'Crear' },
                { path: '/editarFactura', title: 'Editar' }
            ]
        },
        { path: '/3', icon: 'fa fa-money-check-dollar', title: 'Ordenes de Compra',
            children: [
                { path: '/3', title: 'Sub Menú' }
            ]
        },
        { path: '/4', icon: 'fa fa-file-invoice-dollar', title: 'Cotizaciones',
            children: [
                { path: '/4', title: 'Sub Menú' }
            ]
        },
        { path: '/crearRendicion', icon: 'fa fa-wallet', title: 'Rendiciones',
            children: [
                { path: '/crearRendicion', title: 'Crear' },
                { path: '/editarRendicion', title: 'Editar' }
            ]
        },
        { path: '/5', icon: 'fa fa-list-check', title: 'Tareas',
            children: [
                { path: '/5', title: 'Sub Menú' }
            ]
        }
    ]
    export default sidebarMenu;
</script>
