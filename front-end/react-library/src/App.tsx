import React from 'react';
import './App.css';
import { Navbar } from './layouts/NavbarAndFooter/Navbar';
import { Footer } from './layouts/NavbarAndFooter/Footer';
import { HomePage } from './layouts/HomePage/HomePage';
import { SearchBooksPage } from './layouts/SearchBooksPage/SearchBooksPage';

export const App = () => {   //We make it to functional component, like all others
  return (
    <div>
      <Navbar/>
      {/* <HomePage/> */}
      <SearchBooksPage/>
      <Footer/>
    </div>
  );
}