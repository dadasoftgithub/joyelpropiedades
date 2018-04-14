import Vue from 'vue'
import Router from 'vue-router'
// import HelloWorld from '@/components/HelloWorld'
import Login from '@/components/Login'
import Service from '@/components/Service'
// import Bootstrap from '@/components/Bootstrap'
import Registro from '@/components/Registro'
import Panel from '@/components/Panel'
import AppHeader from '@/components/AppHeader'
import Ficha from '@/components/Ficha'
import Gmap1 from '@/components/Gmap1'
Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '*',
      redirect: '/login'
    },
    {
      path: '/',
      redirect: '/login'
    },
    {
      path: '/login',
      name: 'Login',
      component: Login
    },
    {
      path: '/registro',
      name: 'Registro',
      component: Registro
    },
    {
      path: '/panel',
      name: 'Panel',
      component: Panel,
      meta: {
        requiresAuth: true
      }
    },
    {
      path: '/callservice',
      name: 'Service',
      component: Service
    },
    {
      path: '/headertest',
      name: 'AppHeader',
      component: AppHeader
    },
    {
      path: '/ficha',
      name: 'Ficha',
      component: Ficha
    },
    {
      path: '/mapa',
      name: 'google-map',
      component: Gmap1
    }
  ]
})
