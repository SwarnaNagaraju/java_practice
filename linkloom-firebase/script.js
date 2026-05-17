// Import the functions you need from the SDKs you need
import { initializeApp } from "firebase/app";
import { getAnalytics } from "firebase/analytics";
// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries

// Your web app's Firebase configuration
// For Firebase JS SDK v7.20.0 and later, measurementId is optional
const firebaseConfig = {
  apiKey: "AIzaSyCxO_XDHZ-x3ac_dHYA0OV2vaHydCjcMsU",
  authDomain: "linkloom-app-e32f5.firebaseapp.com",
  projectId: "linkloom-app-e32f5",
  storageBucket: "linkloom-app-e32f5.firebasestorage.app",
  messagingSenderId: "559696268559",
  appId: "1:559696268559:web:d03d254613e899ccb9427a",
  measurementId: "G-ZFLZ5HZ993"
};

// Initialize Firebase
const app = initializeApp(firebaseConfig);
const analytics = getAnalytics(app);set-url 

// SIGN UP
window.signup = function () {
  const email = document.getElementById("email").value;
  const password = document.getElementById("password").value;

  createUserWithEmailAndPassword(auth, email, password)
    .then(() => alert("Signup success"))
    .catch(err => alert(err.message));
};

// LOGIN
window.login = function () {
  const email = document.getElementById("email").value;
  const password = document.getElementById("password").value;

  signInWithEmailAndPassword(auth, email, password)
    .then(() => alert("Login success"))
    .catch(err => alert(err.message));
};

// RESET PASSWORD
window.resetPassword = function () {
  const email = document.getElementById("email").value;

  sendPasswordResetEmail(auth, email)
    .then(() => alert("Reset email sent"))
    .catch(err => alert(err.message));
};
// ✅ Make functions global

window.signup = function () {
  console.log("Signup clicked");
};

window.login = function () {
  console.log("Login clicked");
};

window.resetPassword = function () {
  console.log("Reset clicked");
};