function startTime() {
  let now = new Date();

  let hr = now.getHours();
  let min = now.getMinutes();
  let sec = now.getSeconds();

  sec = getting(sec);
  min = getting(min);

  document.getElementById('txt').innerHTML =
  hr + ":" + min + ":" + sec;
  let t = setTimeout(startTime, 500);

}

function getting(j) {
  if (j < 10) {j = "0" + j};
  return j;
}

function myFunction1() {
  var x = document.getElementById("myDIV1");
  if (x.style.display === "none") {
    x.style.display = "block";
  } else {
    x.style.display = "none";
  }
}

function myFunction2() {
  var x = document.getElementById("myDIV2");
  if (x.style.display === "none") {
    x.style.display = "block";
  } else {
    x.style.display = "none";
  }
}

function myFunction3() {
  var x = document.getElementById("myDIV3");
  if (x.style.display === "none") {
    x.style.display = "block";
  } else {
    x.style.display = "none";
  }
}

function myFunction4() {
  var x = document.getElementById("myDIV4");
  if (x.style.display === "none") {
    x.style.display = "block";
  } else {
    x.style.display = "none";
  }
}

function myFunction5() {
  var x = document.getElementById("myDIV5");
  if (x.style.display === "none") {
    x.style.display = "block";
  } else {
    x.style.display = "none";
  }
}
function myFunction6() {
  var x = document.getElementById("myDIV6");
  if (x.style.display === "none") {
    x.style.display = "block";
  } else {
    x.style.display = "none";
  }
}

function myFunction7() {
  var x = document.getElementById("myDIV7");
  if (x.style.display === "none") {
    x.style.display = "block";
  } else {
    x.style.display = "none";
  }
}

function myFunction8() {
  var x = document.getElementById("myDIV8");
  if (x.style.display === "none") {
    x.style.display = "block";
  } else {
    x.style.display = "none";
  }
}

function myFunction9() {
  var x = document.getElementById("myDIV9");
  if (x.style.display === "none") {
    x.style.display = "block";
  } else {
    x.style.display = "none";
  }
}

function myFunction10() {
  var x = document.getElementById("myDIV10");
  if (x.style.display === "none") {
    x.style.display = "block";
  } else {
    x.style.display = "none";
  }
}
