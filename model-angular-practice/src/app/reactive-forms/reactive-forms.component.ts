import { Component, OnInit } from '@angular/core';
import { AbstractControl, FormControl, FormGroup, ValidationErrors, ValidatorFn, Validators } from '@angular/forms';

@Component({
  selector: 'app-reactive-forms',
  templateUrl: './reactive-forms.component.html',
  styleUrls: ['./reactive-forms.component.css']
})
export class ReactiveFormsComponent implements OnInit {


  constructor() { 

    
  this.form.controls['email'].setValidators([Validators.required])
  this.form.controls['city'].setValidators([Validators.required,this.cityValidator()])
  this.form.controls['username'].setValidators([Validators.required,this.myValidator(),this.minLengthValidator()])
  this.form.controls['evenodd'].setValidators([Validators.required,this.evenOddValidator()])
  }

  
  form= new FormGroup({
    email: new FormControl(),
    username:new FormControl(),
    city:new FormControl(),
    evenodd:new FormControl()
  })
  
  onsubmit(){
    console.log(this.form);
    

    if(this.form.controls['email'].errors!=null)
    console.log(this.form.controls['email'].errors['required']);

    if(this.form.invalid){
      
      if(this.form.controls['email'].invalid){
        if(this.form.controls['email'].errors!=null){
          if(this.form.controls['email'].errors['required'])
             alert('email is mandatory')
          
        }
      }

      if(this.form.controls['city'].invalid){
        if(this.form.controls['city'].errors!=null){
          if(this.form.controls['city'].errors['required'])
             alert('city is mandatory')
          if(this.form.controls['city'].errors['txtError'])
             alert('city is not acceptable')
        }
      }

      if(this.form.controls['username'].invalid){
        if(this.form.controls['username'].errors!=null){
          if(this.form.controls['username'].errors['required'])
             alert('username is mandatory')
             if(this.form.controls['username'].errors['nameError'])
             alert('hell is not acceptable')
            if(this.form.controls['username'].errors['txtError'])
              alert('min length is 5')
           
        }
      }

      if(this.form.controls['evenodd'].invalid){
        if(this.form.controls['evenodd'].errors!=null){
          if(this.form.controls['evenodd'].errors['required'])
             alert('evenodd is mandatory')
          if(this.form.controls['evenodd'].errors['txtError'])
             alert('odd is not acceptable')
        }
      }

    }
    
  }

  ngOnInit(): void {

  }

myValidator():ValidatorFn
{

    return (ctrl:AbstractControl):ValidationErrors|null=>{

        if(ctrl.value=='hell')
        return {txtError:'hell is not acceptable'}

        else
        return null;
    }
}

cityValidator():ValidatorFn
{

    return (ctrl:AbstractControl):ValidationErrors|null=>{
      
        if(ctrl.value=='mumbai'||ctrl.value=='pune'||ctrl.value=='bijapur'||ctrl.value=='bangalore'||ctrl.value=='hubli'||ctrl.value=='gulbarga')
        return {nameError:ctrl.value+' is not acceptable'}

        else
        return null;
    }
}

minLengthValidator():ValidatorFn
{

    return (ctrl:AbstractControl):ValidationErrors|null=>{
      let x:string=ctrl.value

      if(x!=null){
       if(x.length<5)
        return {txtError:' min length is 5'}
        else
        return null;
      }
      return null;
    }
}

evenOddValidator():ValidatorFn
{

    return (ctrl:AbstractControl):ValidationErrors|null=>{
      let x:number=ctrl.value

      if(x!=null){
       if(x%2!=0)
        return {txtError:' odd is not allowed'}
        else
        return null;
      }
      return null;
    }
}

}
