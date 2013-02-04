function cleartext(name){
    var intext = document.getElementById(name.toString());
    
    intext.setAttribute("value", "");
    intext.focus() = true;
}
function readdtext(name){
    var outtext = document.getElementById(name.toString());
    
    outtext.setAttribute("value", name.toString());
    
    
}
