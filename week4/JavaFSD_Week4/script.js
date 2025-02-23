openFun=()=>{
    let col = document.getElementsByClassName('collapse')[0]
    col.style.display='flex'
    let openBtn = document.getElementsByClassName('open-btn')[0]
    openBtn.style.display='none'
    let closeBtn = document.getElementsByClassName('collapse-btn')[0]
    closeBtn.style.display='contents'
    let carousel = document.getElementsByClassName('carousel')[0]
    carousel.style.marginTop="0px"
}
collapseFun=()=>{
    let col = document.getElementsByClassName('collapse')[0]
    col.style.display='none'
    let openBtn = document.getElementsByClassName('open-btn')[0]
    openBtn.style.display='contents'
    let closeBtn = document.getElementsByClassName('collapse-btn')[0]
    closeBtn.style.display='none'
    let carousel = document.getElementsByClassName('carousel')[0]
    carousel.style.marginTop="66px"
}

// scripts.js
// scripts.js
let currentIndex = 0;
const items = document.querySelectorAll('.carousel-item');

function showSlide(index) {
    items.forEach((item, i) => {
        item.classList.toggle('active', i === index);
    });
}

function prevSlide() {
    currentIndex = (currentIndex > 0) ? currentIndex - 1 : items.length - 1;
    showSlide(currentIndex);
}

function nextSlide() {
    currentIndex = (currentIndex < items.length - 1) ? currentIndex + 1 : 0;
    showSlide(currentIndex);
}

document.addEventListener('DOMContentLoaded', () => {
    document.querySelector('.prev').addEventListener('click', prevSlide);
    document.querySelector('.next').addEventListener('click', nextSlide);

    // Initialize the carousel
    showSlide(currentIndex);

    console.log('Carousel initialized.');
});