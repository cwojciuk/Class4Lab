function cleartext(name){
    var intext = document.getElementById(name.toString());
    
    intext.setAttribute("value", "");
    intext.focus() = true;
}
function readdtext(name){
    var outtext = document.getElementById(name.toString());
    if(outtext.getAttribute("value")==""){
        outtext.setAttribute("value", name.toString());
    }
}
function dropdown(name){
    document.getElementById(name.toString()).focus() = true;
}
