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
import { ExperiencesComponent } from './experiences/experiences.component';
import { ContactComponent } from './contact/contact.component';
import { FormationsComponent } from './formations/formations.component';
import { FormationDetailsComponent } from './formation-details/formation-details.component';
import { SafePipePipe } from './safe-pipe.pipe';
import {HttpClientModule} from '@angular/common/http';
import {FormationResolver} from './formations/formations-resolver.service';
import {TutorielResolver} from './tutoriels/tutoriels-resolver.service';

const appRoutes: Routes = [
  {path: '', redirectTo: 'home', pathMatch: 'full'},
  {path: 'home', component: HomeComponent},
  {path: 'blog', component: BlogComponent},
  {path: 'tutoriels', component: TutorielsComponent, resolve: {tutoriels: TutorielResolver}},
  {path: 'formations', component: FormationsComponent, resolve: { formations: FormationResolver }},
  {path: 'formations/:id', component: FormationsComponent, resolve: { formations: FormationResolver }, children: [
      {path: 'details', component: FormationDetailsComponent}
    ]},
  {path: 'about', component: AboutComponent},
  {path: 'contact', component: ContactComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    BlogComponent,
    HeaderComponent,
    TutorielsComponent,
    AboutComponent,
    ExperiencesComponent,
    ContactComponent,
    FormationsComponent,
    FormationDetailsComponent,
    SafePipePipe
  ],
  imports: [
    CommonModule,
    BrowserModule,
    ScrollEventModule,
    RouterModule.forRoot(appRoutes),
    MDBBootstrapModule.forRoot(),
    ProgressbarModule.forRoot(),
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
