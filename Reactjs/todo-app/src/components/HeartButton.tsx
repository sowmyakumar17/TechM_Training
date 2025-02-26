import React, { useState } from "react";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faHeart as regularHeart } from "@fortawesome/free-regular-svg-icons";
import { faHeart as solidHeart } from "@fortawesome/free-solid-svg-icons";


const HeartButton= () => {
    const [liked, setLiked] = useState(false);
    const [Hovered,setHovered]=useState(false)

    return (
        <div style={{textAlign:"center", padding:"30px"}}>
        <h1 style={{margin:"1px"}}>Like</h1>
        <button 
        onClick={() => 
        setLiked(!liked)}
        
        onMouseEnter={()=>setHovered(true)}
        onMouseLeave={()=>setHovered(false)}
        
        style={{ fontSize: "100px", border: "none", background: "none", cursor: "pointer", padding: "50px"}}>
            <FontAwesomeIcon icon={liked ? solidHeart : regularHeart} style={{ color: liked ? "red" : "black" }} />
        </button>
        </div>
        
        
    );
};

export default HeartButton;
