const btnMobile = document.getElementById("btn");

function mostrarMenu() {
    const nav = document.getElementById('nav');
    nav.classList.toggle('active')
}

btnMobile.addEventListener('click', mostrarMenu);
btnMobile.addEventListener('touchstart', mostrarMenu);