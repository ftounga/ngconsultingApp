import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {MDBBootstrapModule} from 'angular-bootstrap-md';
import {Routes, RouterModule} from '@angular/router';
import {AppComponent} from './app.component';
import {HomeComponent} from './home/home.component';
import {BlogComponent} from './blog/blog.component';
import { HeaderComponent } from './header/header.component';
import { TutorielsComponent } from './tutoriels/tutoriels.component';
import { AboutComponent } from './about/about.component';
import { ProgressbarModule } from 'ngx-bootstrap/progressbar';
import {CommonModule} from '@angular/common';
import {ScrollEventModule} from 'ngx-scroll-event';

const appRoutes: Routes = [
  {path: '', redirectTo: 'home', pathMatch: 'full'},
  {path: 'home', component: HomeComponent},
  {path: 'blog', component: BlogComponent},
  {path: 'tutoriels', component: TutorielsComponent},
  {path: 'about', component: AboutComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    BlogComponent,
    HeaderComponent,
    TutorielsComponent,
    AboutComponent
  ],
  imports: [
    CommonModule,
    BrowserModule,
    ScrollEventModule,
    RouterModule.forRoot(appRoutes),
    MDBBootstrapModule.forRoot(),
    ProgressbarModule.forRoot()
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
