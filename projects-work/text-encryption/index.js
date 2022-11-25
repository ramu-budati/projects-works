



document.querySelector('.enbutton').addEventListener('click' , function(){
    let enalgo = document.querySelector('.enalgorithms').value;
    enalgo = parseInt(enalgo);
    console.log(enalgo);
    var enInput = document.querySelector('#enplaintext').value;
    console.log(enInput);
    let enkey = document.querySelector('.enkey').value;
    console.log(enkey);
    

    if(enalgo == 01)
    {
            // ceaser_cipher
        const str = enInput;
        const enshift =parseInt( enkey);
    //check if letter is uppercase
        function isUpperCase(str) {
            return str === str.toUpperCase();
        }

        //decipher the string
        let ceaserCipher = (str, key) => {
        let decipher = '';
        
        //decipher each letter
        for(let i = 0; i < str.length; i++){
            
            //if letter is uppercase then add uppercase letters
            if(isUpperCase(str[i])){
            decipher += String.fromCharCode((str.charCodeAt(i) + key - 65) % 26 + 65);
            }else{
            //else add lowercase letters
            decipher += String.fromCharCode((str.charCodeAt(i) + key - 97) % 26 + 97);
            }
        }
        return decipher;
        }
            console.log(ceaserCipher(str, 13));
            document.querySelector('#enciphertext').value = ceaserCipher(str, enshift);

    }
    else if(enalgo == 02)
    {
       
        function isLetter (str) {
            return str.length === 1 && str.match(/[a-zA-Z]/i)
          }
           
       
          function isUpperCase (character) {
            if (character === character.toUpperCase()) {
              return true
            }
            if (character === character.toLowerCase()) {
              return false
            }
          }
           
         
          function encrypt (message, key) {
            let result = ''
           
            for (let i = 0, j = 0; i < message.length; i++) {
              const c = message.charAt(i)
              if (isLetter(c)) {
                if (isUpperCase(c)) {
                  result += String.fromCharCode((c.charCodeAt(0) + key.toUpperCase().charCodeAt(j) - 2 * 65) % 26 + 65) // A: 65
                } else {
                  result += String.fromCharCode((c.charCodeAt(0) + key.toLowerCase().charCodeAt(j) - 2 * 97) % 26 + 97) // a: 97
                }
              } else {
                result += c
              }
              j = ++j % key.length
            }
            return result
          }
          document.querySelector('#enciphertext').value = encrypt(enInput, enkey);

    }
    else if(enalgo == 03)
    {
       
        Encrypt();

    }
    else if(enalgo == 04)
    {
      var myString   = "This is ramu";
      var myPassword = "abcd";

      // PROCESS
      var encrypted = CryptoJS.AES.encrypt(enInput, enkey); 
      


      document.querySelector('#enciphertext').value = encrypted;
      // document.getElementById("demo0").innerHTML = myString;
      // document.getElementById("demo1").innerHTML = encrypted;

      // document.getElementById("demo2").innerHTML = decrypted;
      // document.getElementById("demo3").innerHTML = decrypted.toString(CryptoJS.enc.Utf8);

    }
    else if(enalgo == 5)
    {
      var encrypted = CryptoJS.DES.encrypt(enInput, enkey);

      document.querySelector('#enciphertext').value = encrypted;
    }
   




});






document.querySelector('.debutton').addEventListener('click' , function(){
    let dealgo = document.querySelector('.dealgorithms').value;
    let deInput = document.querySelector('#deciphertext').value;
    console.log(deInput);
    let dekey = document.querySelector('.dekey').value;



    if(dealgo == 01)
    {
        // ceaser_cipher 
        function CaesarDecryption (encryptedString, unshiftAmount) {
            var plainText = "";
            for(var i = 0; i < encryptedString.length; i++) {
                var encryptedCharacter = encryptedString.charCodeAt(i);
                if(encryptedCharacter >= 97 && encryptedCharacter <= 122) {
                    plainText += String.fromCharCode((encryptedCharacter-97 - unshiftAmount + 26) %26 + 97 );
                } else if(encryptedCharacter >= 65 && encryptedCharacter <= 90) {
                    plainText += String.fromCharCode((encryptedCharacter-65 - unshiftAmount + 26) %26 + 65 );
                } else {
                    plainText += String.fromCharCode(32);
                }
            }
            return plainText;
        }
        console.log(CaesarDecryption("nggnpxngbapr",13));
        document.querySelector('#deplaintext').value =CaesarDecryption(deInput , dekey) ;
    }
    else if(dealgo == 02)
    {
        function isLetter (str) {
            return str.length === 1 && str.match(/[a-zA-Z]/i)
          }
           
          /**
           * Check if is Uppercase or Lowercase
           * @param {String} character - character to check
           * @return {Boolean} result of the checking
           */
          function isUpperCase (character) {
            if (character === character.toUpperCase()) {
              return true
            }
            if (character === character.toLowerCase()) {
              return false
            }
          }

          function decrypt (message, key) {
            let result = ''
           
            for (let i = 0, j = 0; i < message.length; i++) {
              const c = message.charAt(i)
              if (isLetter(c)) {
                if (isUpperCase(c)) {
                  result += String.fromCharCode(90 - (25 - (c.charCodeAt(0) - key.toUpperCase().charCodeAt(j))) % 26)
                } else {
                  result += String.fromCharCode(122 - (25 - (c.charCodeAt(0) - key.toLowerCase().charCodeAt(j))) % 26)
                }
              } else {
                result += c
              }
              j = ++j % key.length
            }
            return result
          }
          document.querySelector('#deplaintext').value =decrypt(deInput , dekey) ;


    }
    else if(dealgo == 03)
    {
        Decrypt();
    }
    else if(dealgo == 04)
    {
      var decrypted = CryptoJS.AES.decrypt(deInput, dekey);
      document.querySelector('#deplaintext').value  = decrypted.toString(CryptoJS.enc.Utf8);

    }
    else if (dealgo == 05)
    {
      var decrypted = CryptoJS.DES.decrypt(deInput, dekey);
      document.querySelector('#deplaintext').value  = decrypted.toString(CryptoJS.enc.Utf8);
    }
    


});







//rail fence
function Encrypt() {
    plaintext = document.getElementById("enplaintext").value.toLowerCase().replace(/[^a-z]/g, "");  
    if(plaintext.length < 1){ alert("please enter some plaintext"); return; }    
    var key = parseInt(document.getElementById("enkey").value);
    if(key > Math.floor(2*(plaintext.length-1))){ alert("key is too large for the plaintext length."); return; }  
    ciphertext = "";
    for(line=0; line<key-1; line++){
       skip=2*(key-line-1);   j=0;
        for(i=line; i<plaintext.length;){
            ciphertext += plaintext.charAt(i);
            if((line==0) || (j%2 == 0)) i+=skip;
           else i+=2*(key-1) - skip;  
           j++;          
        }
    }
    for(i=line; i<plaintext.length; i+=2*(key-1)) ciphertext += plaintext.charAt(i);
    document.getElementById("enciphertext").value = ciphertext;
}

function Decrypt(f) {
    ciphertext = document.getElementById("deciphertext").value.toLowerCase().replace(/[^a-z]/g, "");  
    if(ciphertext.length < 1){ alert("please enter some ciphertext (letters only)"); return; }    
    var key = parseInt(document.getElementById("dekey").value);
    if(key > Math.floor(2*(ciphertext.length-1))){ alert("please enter 1 - 22."); return; }      
    pt = new Array(ciphertext.length);   k=0;
    for(line=0; line<key-1; line++){
       skip=2*(key-line-1);  j=0;
        for(i=line; i<ciphertext.length;){
            pt[i] = ciphertext.charAt(k++);
            if((line==0) || (j%2 == 0)) i+=skip;
           else i+=2*(key-1) - skip;  
           j++;        
        }
    }
    for(i=line; i<ciphertext.length; i+=2*(key-1)) pt[i] = ciphertext.charAt(k++);
    document.getElementById("deplaintext").value = pt.join("");
}








// tab js 

function openCity(evt, cityName) {
  var i, tabcontent, tablinks;
  tabcontent = document.getElementsByClassName("tabcontent");
  for (i = 0; i < tabcontent.length; i++) {
    tabcontent[i].style.display = "none";
  }
  tablinks = document.getElementsByClassName("tablinks");
  for (i = 0; i < tablinks.length; i++) {
    tablinks[i].className = tablinks[i].className.replace(" active", "");
  }
  document.getElementById(cityName).style.display = "block";
  evt.currentTarget.className += " active";
}

// Get the element with id="defaultOpen" and click on it
document.getElementById("defaultOpen").click();






// hashing 


document.querySelector('.hashingbtn').addEventListener('click' , function(){
  let hashfun = parseInt(document.querySelector('.hashtec').value);
  let hashInput = document.querySelector('#hashinput').value;
  let output;


  if(hashfun == 01)
  {
    output = CryptoJS.MD5(hashInput);
    document.getElementById("hashoutput").innerHTML = output;
  }
  else if (hashfun == 02 )
  {
    output = CryptoJS.SHA1(hashInput);
    document.getElementById("hashoutput").innerHTML = output;

  }
  else if(hashfun == 03)
  {
    output = CryptoJS.SHA3(hashInput);
    document.getElementById("hashoutput").innerHTML = output;

  }
  else if(hashfun == 04)
  {
    output = CryptoJS.SHA256(hashInput);
    document.getElementById("hashoutput").innerHTML = output;

  }
  else if(hashfun == 05)
  {
    output = CryptoJS.SHA512(hashInput);
    document.getElementById("hashoutput").innerHTML = output;
  }

});