
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderManager from "./components/ui/OrderGrid"

import InventoryManager from "./components/ui/InventoryGrid"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orders',
                name: 'OrderManager',
                component: OrderManager
            },

            {
                path: '/inventories',
                name: 'InventoryManager',
                component: InventoryManager
            },



    ]
})
