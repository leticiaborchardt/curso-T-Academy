import { Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { AboutComponent } from './components/about/about.component';
import { ContactComponent } from './components/contact/contact.component';
import { BooksComponent } from './components/books/books.component';
import { AddBookComponent } from './components/add-book/add-book.component';


export const routes: Routes = [
    {
        path: '' ,
        component:HomeComponent
    },
    {
        path: 'about', 
        component: AboutComponent,
        title: 'About',
        
    },
    {
        path: 'contact', 
        component: ContactComponent,
        title:'Contact'
    },
    {
        path: 'books', 
        component: BooksComponent,
        title:'Books'
    }, {
        path: 'add-book', 
        component: AddBookComponent,
        title:'Books'
    },
];
