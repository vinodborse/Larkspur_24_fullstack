async function data() {
    reqData =  document.getElementById('req-data').value;

    url = 'https://dummyjson.com/products/'+ reqData;
    
    apiData = await fetch(url, {method: 'GET'});
    
    finalData = await apiData.json();

    console.log("FINAL DATA:- ", finalData);

    document.getElementById('res-data').innerHTML = "<h1> PRODUCT NAME:- "+finalData.title+" </h1> <img src='"+finalData.thumbnail+"' alt=''>";

}




// document.getElementById('btn').addEventListener('click', function() {
//     document.getElementById('res-data').innerHTML = "<h1> PRODUCT NAME:- Vinod<h1>";
// })