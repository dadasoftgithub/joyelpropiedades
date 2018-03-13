/*global google*/
<template>
  <div class="google-map" v-bind:id="mapName"></div>
</template>

<script>
/* AIzaSyDeud5V0i9KzsTDwpQaKuTf8zHlsiGscV8 API KEY GOOGLE */
export default {
  name: 'google-map',
  props: ['name'],
  data: function () {
    return {
      mapName: this.name + '-map',
      markerCoordinates: [{
        latitude: -34.614019,
        longitude: -58.433556
      },
      {
        latitude: -34.614086,
        longitude: -58.433730
      },
      {
        latitude: -34.613786,
        longitude: -58.434268
      }]
    }
  }
  /* mounted: function () {
    console.log('this mapa', google.maps)
    const element = document.getElementById(this.mapName)
    console.log('element', element)
    const options = {
      zoom: 14,
      center: new google.maps.LatLng(-34.614019, -58.433556)
    }
    const map = new google.maps.Map(element, options)

    // looping through each coordinates
    this.markerCoordinates.forEach((coord) => {
      const position = new google.maps.LatLng(coord.latitude, coord.longitude)
      const marker = new google.maps.Marker({
        position, map
      })
    })
  } */
}
</script>
<style scoped>
.google-map {
  width: 800px;
  height: 600px;
  margin: 0 auto;
  background: #f9f9f9;
  border:1px solid #f4f1e2;
}
</style>
