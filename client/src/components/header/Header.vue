<template>
  <header>
    <div class="container flex align-center space-between">
      <router-link to="/">
        <Logo></Logo>
      </router-link>
      <Menu></Menu>
      <LoginButton></LoginButton>
    </div>
  </header>
</template>

<script setup lang="ts">
import Logo from "../../assets/logo.svg";
import Menu from "./Menu.vue";
import LoginButton from "./LoginButton.vue";
</script>

<style scoped lang="scss">
header {
  position: relative;
  padding: 0.5rem 0;
  box-shadow: 1px 1px 5px #aaa;
}
</style>