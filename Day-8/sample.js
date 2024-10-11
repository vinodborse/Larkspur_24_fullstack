
function showName() {
    nms = document.getElementById('nm').value;
    
    document.getElementById('dv-1').innerText = "<h1 style= 'color: red'> Vinod </h1>";
    
    document.getElementById('dv-2').innerHTML = "<h2 style= 'color: red'> Vinod </h2>";
    
    console.log(nms);

}


function ageData() {
    age = document.getElementById('ag').value;
    if(age<18) {
        document.getElementById('result').innerHTML = "<h1 style= 'color: red'>Yo baby</h1>";
    } else {
        document.getElementById('result').innerHTML = "<h1 style= 'color: green'>kay re dada</h1>";
    }
}