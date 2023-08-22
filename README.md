# Water-Refilling-Station-
Final Project

//Sample Form of TRS 

@extends('layouts.app')

@include('body.large-modal')
@include('body.small-modal')

@section('content')
    <script src="{{ asset('assets/js/form/domestic.js') }}"></script>
    <div class="pagetitle">
        <h1>Form Elements</h1>
        <nav>
            <ol class="breadcrumb">
                <li class="breadcrumb-item"><a href="{{ route('home') }}">Home</a></li>
                <li class="breadcrumb-item">Forms</li>
                <li class="breadcrumb-item active">Domestic Travel</li>
            </ol>
        </nav>
    </div><!-- End Page Title -->

    <section class="section">
        <div class="row">
            <div class="col-lg-12">

                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">Domestic Travel</h5>

                        <!-- User Credentials Form -->
                        <form class="row g-3" action="{{ url('/forms/view/{id}') }}">

                            <input type="hidden" id="trs_id" value="{{ $id }}">

                            <div class="col-md-12">
                                <div class="form-floating mb-3">
                                    <select class="form-select editable" id="travel_req" name="travel_req" aria-label="State" {{ $id !='' ? 'disabled' : '' }}>
                                        <option value="" selected>Please Select</option>
                                        <option value="1" {{ $travel_req == '1' ? 'selected' : '' }}>Business</option>
                                        <option value="2" {{ $travel_req == '2' ? 'selected' : '' }}>Training</option>
                                        <option value="3" {{ $travel_req == '3' ? 'selected' : '' }}>Assignee</option>
                                    </select>
                                    <label for="travel_req">Request For</label>
                                </div>
                            </div>

                            <div class="col-md-4">
                                <div class="form-floating">
                                    <input type="text" class="form-control" id="last_name" value="{{ $last_name }}"
                                        name="last_name" disabled>

                                    <label for="last_name">Last Name</label>

                                </div>
                            </div>
                            <div class="col-md-4">
                                <div class="form-floating">
                                    <input type="text" class="form-control" id="first_name" value="{{ $first_name }}"
                                        name="first_name" disabled>
                                    <label for="first_name">First Name</label>
                                </div>
                            </div>
                            <div class="col-md-4">
                                <div class="form-floating">
                                    <input type="text" class="form-control" id="middle_name"
                                        value="{{ $middle_initial }}" name="middle_name" disabled>
                                    <label for="middle_name">Middle Initial</label>
                                </div>
                            </div>

                            <hr>

                            <h4 class="card-title">Expense Charging Details</h4>

                            <div class="col-md-6">
                                <div class="form-floating">
                                    <input type="text" class="form-control" id="dept" value="{{ $department }}"
                                        name="dept" disabled>
                                    <label for="dept">Department</label>
                                </div>
                            </div>

                            <div class="col-md-6">
                                <div class="form-floating">
                                    <input type="text" class="form-control editable" id="group" placeholder="Group"
                                        value="{{ $group }}" name="group" {{ $id !='' ? 'disabled' : '' }}>
                                    <label for="group">Group</label>
                                </div>
                            </div>

                            <div class="col-md-6">
                                <div class="form-floating mb-3">
                                    <input type="text" class="form-control" id="branch" value="{{ $branch }}"
                                        name="branch" disabled>
                                    <!-- <select class="form-select" id="floatingSelect" aria-label="State">
                                                            <option selected disabled>Please Select</option>
                                                            <option value="1">Head Office</option>
                                                            <option value="2">Branch Office</option>
                                                        </select> -->
                                    <label for="branch">Branch</label>
                                </div>
                            </div>

                            <div class="col-md-6">
                                <div class="form-floating">
                                    <input type="text" class="form-control" id="position" value="{{ $position }}"
                                        name="position" disabled>
                                    <label for="position">Position</label>
                                </div>
                            </div>

                            <div class="col-md-4">
                                <div class="form-floating mb-3">
                                    <select class="form-select editable" id="employment_status" name="employment_status" aria-label="State" {{ $id !='' ? 'disabled' : '' }}>
                                        <option value="" selected>Please Select</option>
                                        <option value="1" {{ $employment_status == '1' ? 'selected' : '' }}>
                                            Probationary</option>
                                        <option value="2" {{ $employment_status == '2' ? 'selected' : '' }}>Regular
                                        </option>
                                    </select>
                                    <label for="employment_status">Employment Status</label>
                                </div>
                            </div>

                            <div class="col-md-4">
                                <div class="form-floating mb-3">
                                    <select class="form-select editable" id="civil_status" name="civil_status" aria-label="State" {{ $id !='' ? 'disabled' : '' }}>
                                        <option value="" selected>Please Select</option>
                                        <option value="1" {{ $civil_status == '1' ? 'selected' : '' }}>Single</option>
                                        <option value="2" {{ $civil_status == '2' ? 'selected' : '' }}>Married
                                        </option>
                                    </select>
                                    <label for="civil_status">Civil Status</label>
                                </div>
                            </div>

                            <div class="col-md-4">
                                <div class="form-floating mb-3">
                                    <select class="form-select editable" name="gender" id="gender" aria-label="State" {{ $id !='' ? 'disabled' : '' }}>
                                        <option value=""selected>Please Select</option>
                                        <option value="Male" {{ $gender == 'Male' ? 'selected' : '' }}>Male</option>
                                        <option value="Female" {{ $gender == 'Female' ? 'selected' : '' }}>Female</option>
                                    </select>
                                    <label for="gender">Gender</label>
                                </div>
                            </div>

                            <hr>

                            <div class="icon">
                                <i class="bx bxs-info-circle" data-bs-toggle="modal"
                                    data-bs-target="#verticalycentered"></i>
                                <div class="label">Important Note</div>
                            </div>

                            <div>
                                <span class="fw-bold">1.</span> This form must be filled up completely and
                                must be given to Director for Administration Services:
                                Atleast <span class="text-decoration-underline fw-bold">ONE MONTH
                                    BEFORE</span> the employee's departure for <span class="fw-bold">BUSINESS
                                    TRIP</span>.<br>
                                <span class="fw-bold">1.1</span> Coordinate with ADM at least <span
                                    class="text-decoration-underline fw-bold">One (1) month before</span>
                                the employee's departure regarding <span class="fw-bold">AIRFARE
                                    RATE</span>.<br><br>
                                <span class="fw-bold">2.</span> Departure of employee may vary depending on
                                the availability of booking.
                            </div>


                            <div class="modal fade" id="verticalycentered" tabindex="-1">
                                <div class="modal-dialog modal-dialog-centered">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <h5 class="modal-title">Note</h5>
                                            <button type="button" class="btn-close" data-bs-dismiss="modal"
                                                aria-label="Close"></button>
                                        </div>
                                        <div class="modal-body">
                                            <span class="fw-bold">1.</span> This form must be filled up completely and
                                            must be given to Director for Administration Services:
                                            Atleast <span class="text-decoration-underline fw-bold">ONE MONTH
                                                BEFORE</span> the employee's departure for <span class="fw-bold">BUSINESS
                                                TRIP</span>.<br><br>
                                            <span class="fw-bold">1.1</span> Coordinate with ADM at least <span
                                                class="text-decoration-underline fw-bold">One (1) month before</span>
                                            the employee's departure regarding <span class="fw-bold">AIRFARE
                                                RATE</span>.<br><br>
                                            <span class="fw-bold">2.</span> Departure of employee may vary depending on
                                            the availability of booking.
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-secondary"
                                                data-bs-dismiss="modal">Close</button>
                                        </div>
                                    </div>
                                </div>
                            </div><!-- End Vertically centered Modal-->

                            <hr>

                            <fieldset class="row mb-12">

                                <div class="col-sm-2">
                                    <div class="form-check">
                                        <input class="form-check-input editable" type="radio" name="travelType"
                                            id="travelType1" value="1" {{ $travel_Type == '1' ? 'checked' : '' }} checked {{ $id !='' ? 'disabled' : '' }}>
                                        <label class="form-check-label" for="travelType1">
                                            Official Business
                                        </label>
                                    </div>
                                </div>

                                <div class="col-sm-2">
                                    <div class="form-check">
                                        <input class="form-check-input editable" type="radio" name="travelType"
                                            id="travelType2" value="2" {{ $travel_Type == '2' ? 'checked' : '' }} {{ $id !='' ? 'disabled' : '' }}>
                                        <label class="form-check-label" for="travelType2">
                                            Personal
                                        </label>
                                    </div>
                                </div>

                            </fieldset>

                            <div id="1" class="row g-3">
                                <h5 class="card-title">A. Official Business</h5>

                                <div class="col-md-4">
                                    <div class="form-floating">
                                        <input type="text" class="form-control editable" value="{{ $location }}"
                                            name="location" id="location" placeholder="Location" {{ $id !='' ? 'disabled' : '' }}>
                                        <label for="location">Location</label>
                                    </div>
                                </div>

                                <div class="col-sm-3">
                                    <div class="form-floating">
                                        <input type="date" name="calendar1" value="{{ $from }}" min="{{date('Y-m-d')}}"
                                            id="calendar1" class="form-control editable" {{ $id !='' ? 'disabled' : '' }}>
                                        <label for="inputDate">From</label>
                                    </div>
                                </div>

                                <div class="col-sm-3">
                                    <div class="form-floating">
                                        <input type="date" name="calendar2" value="{{ $to }}" min="{{date('Y-m-d')}}"
                                            id="calendar2" class="form-control editable" {{ $id !='' ? 'disabled' : '' }}>
                                        <label for="inputDate">To</label>
                                    </div>
                                </div>

                                <div class="col-md-2">
                                    <div class="form-floating">
                                        <input type="number" class="form-control editable" value="{{ $number_days }}"
                                            id="days" placeholder="Days" {{ $id !='' ? 'disabled' : '' }}>
                                        <label for="days">Days</label>
                                    </div>
                                </div>

                                <div class="col-md-6">
                                    <div class="form-floating">
                                        <input type="text" class="form-control editable" value="{{ $airports_name }}"
                                            id="airport" placeholder="airport" {{ $id !='' ? 'disabled' : '' }}>
                                        <label for="airport">Airport's Name</label>
                                    </div>
                                </div>

                                <div class="col-md-6">
                                    <div class="form-floating">
                                        <input type="text" class="form-control editable" value="{{ $remarks }}"
                                            id="purpose" placeholder="purpose" {{ $id !='' ? 'disabled' : '' }}>
                                        <label for="purpose">Purpose of Travel</label>
                                    </div>
                                </div>

                            </div>

                            <div id="2" class="row g-3">
                                <h5 class="card-title">B. Personal</h5>

                                <div class="col-md-4">
                                    <div class="form-floating">
                                        <input type="text" class="form-control editable" value="{{ $location }}"
                                            name="blocation" id="blocation" placeholder="Location" {{ $id !='' ? 'disabled' : '' }}>
                                        <label for="Location">Location</label>
                                    </div>
                                </div>

                                <div class="col-md-3">
                                    <div class="form-floating">
                                        <input type="date" name="bcalendar1" value="{{ $from }}"
                                            id="bcalendar1" class="form-control editable" {{ $id !='' ? 'disabled' : '' }}>
                                        <label for="calendar1">From</label>
                                    </div>
                                </div>

                                <div class="col-md-3">
                                    <div class="form-floating">
                                        <input type="date" name="bcalendar2" value="{{ $to }}"
                                            id="bcalendar2" class="form-control editable" {{ $id !='' ? 'disabled' : '' }}>
                                        <label for="calendar2">To</label>
                                    </div>
                                </div>

                                <div class="col-md-2">
                                    <div class="form-floating">
                                        <input type="number" class="form-control editable" value="{{ $number_days }}"
                                            name="bdays" id="bdays" placeholder="Days" {{ $id !='' ? 'disabled' : '' }}>
                                        <label for="days">Days</label>
                                    </div>
                                </div>

                                <div class="col-md-6">
                                    <div class="form-floating">
                                        <input type="text" class="form-control editable" value="{{ $airports_name }}"
                                            name="bairport" id="bairport" placeholder="airport" {{ $id !='' ? 'disabled' : '' }}>
                                        <label for="airport">Airport's Name</label>
                                    </div>
                                </div>

                                <div class="col-md-6">
                                    <div class="form-floating">
                                        <input type="text" class="form-control editable" value="{{ $remarks }}"
                                            name="bpurpose" id="bpurpose" placeholder="purpose" {{ $id !='' ? 'disabled' : '' }}>
                                        <label for="purpose">Remarks</label>
                                    </div>
                                </div>

                            </div>

                            <h5 class="card-title">Accomodation Information</h5>

                            <div class="col-md-6">
                                <div class="form-floating mb-3">
                                    <select class="form-select editable" name="accomodation_type" id="accomodation_type"
                                        aria-label="State" {{ $id !='' ? 'disabled' : '' }}>
                                        <option value="" selected>Please Select</option>
                                        <option value="1" {{ $accomodation_type == '1' ? 'selected' : '' }}>Hotel
                                        </option>
                                        <option value="2" {{ $accomodation_type == '2' ? 'selected' : '' }}>Dormitory
                                        </option>
                                    </select>
                                    <label for="accomodation_type">Type of Location</label>
                                </div>
                            </div>

                            <div class="col-md-6">
                                <div class="form-floating">
                                    <input type="text" class="form-control editable" value="{{ $accomodation_name }}"
                                        id="accomodation_name" placeholder="Hotel / Dorm" {{ $id !='' ? 'disabled' : '' }}>
                                    <label for="accomodation_name">Name of Hotel / Dorm</label>
                                </div>
                            </div>

                            <h5 class="card-title">Advance Payment (If Needed)</h5>

                            <div class="icon">
                                <div class="label">Domestic Transportation Allowance</div>

                            </div>

                            @if (!empty($id))
                                @if (!empty($advance_payments))
                                    @php $i = 0; @endphp
                                    @foreach ($advance_payments as $advp)
                                        @php $i++; @endphp
                                        <input type="hidden" class="form-control advpay_type" id="advpay_type" value="1">
                                        <div class="col-md-4">
                                            <div class="form-floating">
                                                <input type="date" class="form-control from editable" min="{{date('Y-m-d')}}"
                                                    id="from{{ $i }}" value="{{ $advp->from }}"
                                                    placeholder="From" disabled>
                                                <label for="from">From</label>
                                            </div>
                                        </div>

                                        <div class="col-md-4">
                                            <div class="form-floating">
                                                <input type="date" class="form-control to editable" id="to{{ $i }}" min="{{date('Y-m-d')}}"
                                                    value="{{ $advp->to }}" placeholder="To" disabled>
                                                <label for="to">To</label>
                                            </div>
                                        </div>

                                        <div class="col-md-3">
                                            <div class="form-floating">
                                                <input type="number" class="form-control amount editable"
                                                    id="amount{{ $i }}" value="{{ $advp->amount }}"
                                                    placeholder="Amount" disabled>
                                                <label for="amount">Amount</label>
                                            </div>
                                        </div>

                                        <div class="col-md-1 pt-2" id="DTA4ObjDiv{{ $i }}">
                                            <div class="form-outline">
                                                <button type="button" class="btn btn-danger removeDTA editable"
                                                    OnClick="removeDTA{{ $i }}" {{ $id !='' ? 'hidden' : '' }}><i class="bx bxs-trash"></i></button>
                                            </div>
                                        </div>
                                    @endforeach
                                @endif
                            @else
                            <input type="hidden" class="form-control advpay_type" id="advpay_type" value="1">
                                <div class="col-md-4">
                                    <div class="form-floating">

                                        <input type="date" class="form-control from" min="{{date('Y-m-d')}}"
                                            id="from" placeholder="From">
                                        <label for="from">From</label>
                                    </div>
                                </div>

                                <div class="col-md-4">
                                    <div class="form-floating">
                                        <input type="date" class="form-control to" min="{{date('Y-m-d')}}"
                                            id="to" placeholder="To">
                                        <label for="to">To</label>
                                    </div>
                                </div>

                                <div class="col-md-4">
                                    <div class="form-floating">
                                        <input type="number" class="form-control amount"
                                            id="amount" placeholder="Amount">
                                        <label for="amount">Amount</label>
                                    </div>
                                </div>

                            @endif

                            <div class="row g-3" id="DTA_div">

                            </div>

                            <div class="col-md-3 pt-2">
                                <div class="btn-group" role="group" aria-label="Basic mixed styles example">
                                    <button type="button" id="btnAddDTA" class="btn btn-success editable" {{ $id !='' ? 'hidden' : '' }}>Add</button>
                                </div>
                            </div>

                            <div class="icon">
                                <div class="label">In case of Hotel Accomodation Expense Needed (currency)</div>
                                
                            </div>

                            @if (!empty($id))
                                @if (!empty($advance_payments_type_2))
                                    @php $i = 0; @endphp
                                    @foreach ($advance_payments_type_2 as $advp_type_2)
                                        @php $i++; @endphp
                                        <input type="hidden" class="form-control hadvpay_type" id="hadvpay_type" value="2">
                                        <div class="col-md-4">
                                            <div class="form-floating">
                                                <input type="date" class="form-control hfrom editable" min="{{date('Y-m-d')}}"
                                                    id="hfrom{{ $i }}" value="{{ $advp_type_2->from }}" placeholder="Hotel / Dorm" disabled>
                                                <label for="from">From</label>
                                            </div>
                                        </div>

                                        <div class="col-md-4">
                                            <div class="form-floating">
                                                <input type="date" class="form-control hto editable" min="{{date('Y-m-d')}}"
                                                    id="hto{{ $i }}" value="{{ $advp_type_2->to }}" placeholder="Hotel / Dorm" disabled>
                                                <label for="to">To</label>
                                            </div>
                                        </div>

                                        <div class="col-md-3">
                                            <div class="form-floating">
                                                <input type="number" class="form-control hamount editable"
                                                    id="hamount{{ $i }}" value="{{ $advp_type_2->amount }}" placeholder="Hotel / Dorm" disabled>
                                                <label for="amount">Amount</label>
                                            </div>
                                        </div>

                                        <div class="col-md-1 pt-2" id="HAEN4ObjDiv{{ $i }}">
                                            <div class="form-outline">
                                                <button type="button" class="btn btn-danger removeHAEN editable"
                                                    OnClick="removeHAEN{{ $i }}" {{ $id !='' ? 'hidden' : '' }}><i class="bx bxs-trash"></i></button>
                                            </div>
                                        </div>
                                    @endforeach
                                @endif
                            @else
                            <input type="hidden" class="form-control hadvpay_type" id="hadvpay_type" value="2">
                                <div class="col-md-4">
                                    <div class="form-floating">
                                        <input type="date" class="form-control hfrom editable" min="{{date('Y-m-d')}}" id="hfrom"
                                            placeholder="Hotel / Dorm">
                                        <label for="from">From</label>
                                    </div>
                                </div>

                                <div class="col-md-4">
                                    <div class="form-floating">
                                        <input type="date" class="form-control hto editable" min="{{date('Y-m-d')}}" id="hto"
                                            placeholder="Hotel / Dorm">
                                        <label for="to">To</label>
                                    </div>
                                </div>

                                <div class="col-md-4">
                                    <div class="form-floating">
                                        <input type="number" class="form-control hamount editable" id="hamount"
                                            placeholder="Hotel / Dorm">
                                        <label for="amount">Amount</label>
                                    </div>
                                </div>
                            @endif

                            <div class="row g-3" id="HAEN_div">

                            </div>

                            <div class="col-md-3 pt-2">
                                <div class="btn-group" role="group" aria-label="Basic mixed styles example">
                                    <!-- <button type="button" class="btn btn-danger">Delete</button> -->
                                    <button type="button" id="btnAddHAEN" class="btn btn-success editable" {{ $id !='' ? 'hidden' : '' }}>Add</button>
                                </div>
                            </div>

                                            {{-- <h5 class="card-title">Employee's Confirmation</h5>

                                        <div class="col-md-6">
                                            <p>This is to certify that the above business was informed and discussed to me and by my
                                                department Superior / Manager and I voluntarily and willingly accept the domestic
                                                travel assignment that the company prepares for me</p>
                                        </div>

                                        <div class="card col-md-6">
                                            <label for="sig1">CONFIRMED BY:</label>

                                            <div class="text-center">
                                                <div class="circle">
                                                    <div class="dept text-center">MIS</div>
                                                    <div class="sig-divider"></div>
                                                    <div class="date text-center">08-22-2022</div>
                                                    <div class="sig-divider"></div>
                                                    <div class="name text-center">E.J Edem</div>
                                                </div>
                                            </div>
                                            <br>
                                        </div>

                                        <div>
                                            <br>
                                            &nbsp;
                                            &nbsp;
                                        </div>

                                        <div class="card col-md-4">
                                            <label for="sig1">REQUESTED BY: Manager</label>

                                            <div class="text-center">
                                                <div class="circle">
                                                    <div class="dept text-center">MIS</div>
                                                    <div class="sig-divider"></div>
                                                    <div class="date text-center">08-22-2022</div>
                                                    <div class="sig-divider"></div>
                                                    <div class="name text-center">E.J Edem</div>
                                                </div>
                                            </div>
                                            <br>
                                        </div>

                                        <div class="card col-md-4">
                                            <label for="sig1">NOTED BY: Director</label>

                                            <div class="text-center">
                                                <div class="circle">
                                                    <div class="dept text-center">MIS</div>
                                                    <div class="sig-divider"></div>
                                                    <div class="date text-center">08-22-2022</div>
                                                    <div class="sig-divider"></div>
                                                    <div class="name text-center">E.J Edem</div>
                                                </div>
                                            </div>
                                            <br>
                                        </div>

                                        <div class="card col-md-4">
                                            <label for="sig1">APPROVED BY: President</label>

                                            <div class="text-center">
                                                <div class="circle">
                                                    <div class="dept text-center">MIS</div>
                                                    <div class="sig-divider"></div>
                                                    <div class="date text-center">08-22-2022</div>
                                                    <div class="sig-divider"></div>
                                                    <div class="name text-center">E.J Edem</div>
                                                </div>
                                            </div>
                                            <br>
                                        </div> --}}

                            <div>
                                <br>
                                &nbsp;
                                &nbsp;
                            </div>

                            <div class="text-center">

                                <button type="button" id="btnsave" href="{{ url('/forms/view/{id}') }}" class="btn btn-primary ctrl_btn" {{ Route::currentRouteName() =='views' ? 'hidden' : '' }}>Save</button>
                                <button type="button" id="btnUpdate" href="{{ url('/forms/travel/update') }}" class="btn btn-primary ctrl_btn" hidden>Update</button>

                                <button type="button" href="{{ url('/forms/view/edit/{id}') }}" id="edit" class="btn btn-secondary ctrl_btn" {{ $id =='' ? 'hidden' : '' }}>Edit</button>

                                <button class="btn btn-danger ctrl_btn" type="button" id="btncancel" data-bs-toggle="modal" data-bs-target=".bs-example-modal-sm" hidden>Cancel</button>

                                <button class="btn btn-danger ctrl_btn" type="button" id="btnUndo" hidden>Undo</button>

                                <button class="btn btn-success ctrl_btn" type="button" id="btnupdatex" hidden>Save Edit</button>
                                <a href="{{ url('/forms/receipt/'.$id) }}" class="btn btn-success ctrl_btn" style="width:110px;" id="btnsummary" {{ $id =='' ? 'hidden' : '' }}>SUMMARY</a>

                            </div>

                        </form><!-- End floating Labels Form -->

                    </div>
                </div>

            </div>
        </div>

    </section>
@endsection
