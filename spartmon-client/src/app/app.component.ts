import { Component } from '@angular/core';
import { Http ,Headers} from '@angular/http';
import { HttpHeaders } from '@angular/common/http';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'sparta';
  constructor(private http:Http){

  }

  signIn(){
    
   
    
    this.http.get('/OauthDemo/LoginGitHub').subscribe(response => {
      console.log(response)

    });
  
  }

}
