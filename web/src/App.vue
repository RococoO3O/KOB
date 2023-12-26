<template>
  <div>昵称：{{ name }}</div>
  <div>得分：{{ rating }}</div>
  <router-view/>
</template>

<script>
import $ from 'jquery';
import { ref } from 'vue';
export default{
  name: "App",
  setup: () => {
    let name = ref("");
    let rating = ref("");

    $.ajax({
      url:"http://127.0.0.1:3000/pk/index",
      type:"get",
      success: resp => {
        console.log(resp);
        name.value = resp.name;
        rating.value = resp.rating;
      }
    })
    return {
      name,
      rating
    }
  }
}


</script>


<style>
  body{
    background-image: url("@/assets/background.jfif");
    background-size: cover;
  }

</style>
