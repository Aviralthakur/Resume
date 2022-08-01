import React, { useEffect, useState } from 'react'





const butt={
    width:"100%"
   }
const EditPersonal = () => {

    const [user,setUser]=useState({
        mobileNumber:"",
          email:"",
          address:""
      } )
  
      let name,value
      const handleInputs=(e) =>{
          console.log(e);
          name=e.target.name;
          value=e.target.value;
  
          setUser({...user,[name]:value})
  
      }
   const done=()=>{

    if(user.mobileNumber && user.email && user.address){
    fetch("http://localhost:8082/detail",{
      method:"POST",
      headers:{"Content-Type":"application/json"},
       body:(JSON.stringify(user))
  }).then((res)=>res.text())
     .then((q)=>{
      alert(q);
      window.location.href="/";
     })
    }
    else{
      alert("No field should be empty")
    }
   }




  return (
 


    <div style={{margin:"30px"}}>
        <div className="d-flex justify-content-center align-items-center"  >
<section className="login-box">
    <h2 className="text-white">Personal Detail</h2>
    <form className="mt-4">
        <div className="mb-3 bg-white rounded px-2">
          <label for="exampleInputEmail2" className="form-label small-text ">Email address </label>
          <input type="email" className="form-control border-0 p-0" id="exampleInputEmail2" aria-describedby="emailHelp" name='email' value={user.email} onChange={handleInputs}/>
          
        </div>
        <div className="mb-3 bg-white rounded px-2">
          <label for="exampleInputEmail2" className="form-label small-text ">Phone Number </label>
          <input type="email" className="form-control border-0 p-0" id="exampleInputEmail2" aria-describedby="emailHelp" name='mobileNumber' value={user.mobileNumber} onChange={handleInputs}/>
          
        </div>
        <div className="mb-3 bg-white rounded px-2">
          <label for="exampleInputEmail2" className="form-label small-text ">Address </label>
          <input type="email" className="form-control border-0 p-0" id="exampleInputEmail2" aria-describedby="emailHelp" name='address' value={user.address} onChange={handleInputs}/>
          
        </div>

      
        
        <button type="Submit" className="btn btn-danger mt-3" style ={butt} onClick={done} >Done</button>
        <a className="m-1 small-text text-white my-signin" href="/" style={{marginLeft:"auto",marginRight:"auto"}}>Resume</a>
    
   
       
      </form>
</section>
    </div>
    </div>
  )
}
export default EditPersonal;