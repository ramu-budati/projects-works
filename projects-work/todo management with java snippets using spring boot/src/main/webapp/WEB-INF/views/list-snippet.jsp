<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %> 
<!DOCTYPE html>
<html lang="en">
  <head>
      <meta charset="UTF-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <title>list-todo</title>
     <style>
      
      p{
        margin: 0;
        padding: 0;
      }
      .prettyprint{
        width: 90%;
        padding-left: 0;
      }
      .prettyprint{
        margin-left: auto;
        margin-right: auto;
        width: 50%;
        border-radius: 1rem;
        box-shadow: 0 2px 2px ;
      }
     </style>
     <style>
      /* desert scheme ported from vim to google prettify */
pre.prettyprint { display: block; background-color: #333 ;font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif;}
pre .nocode { background-color: none; color: #000 }
pre .str { color: #ffa0a0 } /* string  - pink */
pre .kwd { color: #f0e68c; font-weight: bold }
pre .com { color: #87ceeb } /* comment - skyblue */
pre .typ { color: #98fb98 } /* type    - lightgreen */
pre .lit { color: #cd5c5c } /* literal - darkred */
pre .pun { color: #fff }    /* punctuation */
pre .pln { color: #fff }    /* plaintext */
pre .tag { color: #f0e68c; font-weight: bold } /* html/xml tag    - lightyellow */
pre .atn { color: #bdb76b; font-weight: bold } /* attribute name  - khaki */
pre .atv { color: #ffa0a0 } /* attribute value - pink */
pre .dec { color: #98fb98 } /* decimal         - lightgreen */

/* Specify class=linenums on a pre to get line numbering */
ol.linenums { margin-top: 0; margin-bottom: 0; color: #AEAEAE } /* IE indents via margin-left */
li.L0,li.L1,li.L2,li.L3,li.L5,li.L6,li.L7,li.L8 { list-style-type: none }

@media print {
pre.prettyprint { background-color: none }
pre .str, code .str { color: #060 }
pre .kwd, code .kwd { color: #006; font-weight: bold }
pre .com, code .com { color: #600; font-style: italic }
pre .typ, code .typ { color: #404; font-weight: bold }
pre .lit, code .lit { color: #044 }
pre .pun, code .pun { color: #440 }
pre .pln, code .pln { color: #000 }
pre .tag, code .tag { color: #006; font-weight: bold }
pre .atn, code .atn { color: #404 }
pre .atv, code .atv { color: #060 }
}
  </style>

  </head>
<body>
    <h1>Java Snippets</h1>
    <div class="javaCodes">
       
        <c:forEach  var="snippet"  items="${snippets}">

              <pre class="prettyprint">
                <p>
                <c:forEach  var="code"  items="${snippet.javaCode}">
                  ${code}
                </c:forEach>
                </p>
                <p>Explanation : we have to tryTo </p>
              </pre>
              </div>

        </c:forEach>
      </div>
    <a class="button update" href="/add-snippet">Add</a>
    <script src="https://cdn.jsdelivr.net/gh/google/code-prettify@master/loader/run_prettify.js"></script>
</body>
</html>